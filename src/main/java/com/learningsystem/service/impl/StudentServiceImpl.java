package com.learningsystem.service.impl;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonObjectFormatVisitor;
import com.learningsystem.dao.StudentMapper;
import com.learningsystem.pojo.Student;
import com.learningsystem.pojo.StudentExample;
import com.learningsystem.pojo.StudentExample.Criteria;
import com.learningsystem.service.StudentService;
import com.learningsystem.utils.ExploitUtil;
import com.learningsystem.utils.GetWeekAndDayUtil;
import com.learningsystem.utils.RemoveNullJsonUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper sm;

	RemoveNullJsonUtils nullJsonUtils = new RemoveNullJsonUtils();

	public JSONObject isUserByIdAndPasswd(String openid, String userid, String password, String types,
			HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		// 判断身份
		if (types.equals("teacher")) {

		} else if (types.equals("student")) {
			// 验证信息
			StudentExample se = new StudentExample();
			Criteria ct = se.createCriteria();
			ct.andStuStudentidEqualTo(userid);
			ct.andStuPasswordEqualTo(password);
			Student stu = ExploitUtil.stuIsNull(sm, se);
			if (stu != null) { // 有信息
				json.put("stutas", 200);
				// 插入openid
				stu.setTgOpenid(openid);
				sm.updateByPrimaryKey(stu);
			} else {// 无信息
				json.put("stutas", 500);
			}
		}
		return json;
	}

	//
	public JSONObject getUserInfo(String openid, HttpServletRequest request, HttpServletResponse response) {
		JSONObject json = new JSONObject();
		// 获得该用户的用户信息
		StudentExample se = new StudentExample();
		Criteria ct = se.createCriteria();
		ct.andTgOpenidEqualTo(openid);
		Student stu = ExploitUtil.stuIsNull(sm, se);

		if (stu != null) { // 存在绑定，返回个人信息
			// 
			JSONObject data = new JSONObject();
			
			List<Student> stus = sm.selectAndClassByCClassId(stu.getcClassid());
			JSONArray stuInfo = nullJsonUtils.removeBeanNullByArray(stus, request, response);
			// 
			data.put("stuInfo", stuInfo);
			// 获得周和星期几
			String date = "2017-09-04";
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date1 = null;
			try {
				date1 = dateFormat.parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			int week = GetWeekAndDayUtil.getWeek(date1, new Date()) + 1;
			int day = GetWeekAndDayUtil.getCurrentDayOfWeek() - 1;
			JSONObject time = new JSONObject();
			time.put("week", week);
			time.put("day", day);
			data.put("time", time);
			json.put("stutas", 200);
			data.put("openid", openid);
			data.put("is_bind", true);
			json.put("data", data);
		} else { // 不存在绑定
			json.put("stutas", 200);
			JSONObject data = new JSONObject();
			data.put("is_bind", false);
			data.put("openid", openid);
			
			json.put("data", data);
		}
		return json;
	}

	public JSONObject appendUserInfo(String openid, Student stu) {
		JSONObject json = new JSONObject();
		StudentExample se = new StudentExample();
		Criteria ct = se.createCriteria();
		ct.andTgOpenidEqualTo(openid);
		int i = sm.updateByExampleSelective(stu, se);
		if(i==1){
			json.put("stutas", 200);
		}else{
			json.put("stutas", 500);
		}
		return json;
	}
}
