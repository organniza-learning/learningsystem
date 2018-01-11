package com.learningsystem.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learningsystem.Interceptor.WechatFilter;
import com.learningsystem.dao.StudentMapper;
import com.learningsystem.pojo.Student;
import com.learningsystem.service.StudentService;
import com.learningsystem.utils.GetWeekAndDayUtil;
import com.learningsystem.vo.ResponseVo;
import com.learningsystem.wechatUtils.WechatUtil;

import net.sf.json.JSONObject;

/**
 * @Author : molu
 * @Description:微信小程序交互Controller
 * @Date:Created in 09:38 2017/01/09
 *
 **/
@Controller
@RequestMapping("/WeChat")
public class WeChatController {

	@Autowired
	StudentService stuS;

	/**
	 * @Author : molu
	 * @Description:获得学生，老师信息接口
	 * @Date:Created in 09:38 2017/01/11
	 * @param code
	 * @param key
	 * @param iv
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/decodeUserInfo")
	public ResponseVo decodeUserInfo(@RequestParam("code") String code, @RequestParam("key") String key,
			@RequestParam("iv") String iv) {
		ResponseVo qv = new ResponseVo();

		JSONObject userInfo = WechatUtil.accessWechat(code, key, iv);
		String openid = userInfo.getString("openId");
		// String openid = "1";
		Map<String, Object> data = new HashMap<String, Object>();
		Student stu = stuS.queryStuByOpenid(openid);
		if (stu != null) { // 存在绑定，返回个人信息
			qv.setStutas(200);

			// 访问数据库 得到stuJson(JSONObject，班级学生信息)，添加到data(Map)中。
			List<Student> stus = stuS.selectAndClassByCClassId(stu.getcClassid());
			data.put("is_bind", true);
			data.put("openid", openid);
			List<JSONObject> stuJSON = new ArrayList<JSONObject>();
				// 过滤stus掉中的无用数据及敏感数据
			for (Student student : stus) {
				JSONObject json = WechatFilter.FilterIsNull(student,
						new String[] { "cClassid", "stuId", "tgIdentifying", "gIdentifying" },
						new String[] { "cClassid", "cId", "tTeacher" });
				stuJSON.add(json);
			}
			data.put("studentInfo", stuJSON);

			// 访问数据库 得到teacherJson(JSONObject，老师信息)，添加到data(Map)中。

			// 创建添加time(JSONObject)，添加到data(Map)中。
			JSONObject time = new JSONObject();
			String date = "2017-09-04";
			DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date date1 = null;
			try {
				date1 = dateFormat.parse(date);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			int week = GetWeekAndDayUtil.getWeek(date1, new Date()) + 1;
			int day = GetWeekAndDayUtil.getCurrentDayOfWeek() - 1;
			time.put("week", week);
			time.put("day", day);
			data.put("time", time);

		} else {// 不存在绑定
			qv.setStutas(200);
			data.put("is_bind", false);
			data.put("openid", openid);
		}
		qv.setData(data);

		return qv;
	}

	@ResponseBody
	@RequestMapping("/bindUserInfo")
	public ResponseVo bindUserInfo(@RequestParam("openid") String openid, @RequestParam("userid") String userid,
			@RequestParam("password") String password, @RequestParam("types") String types) {
		ResponseVo qv = new ResponseVo();
		// 判断身份
		if (types.equals("teacher")) {

		} else if (types.equals("student")) {
			// 验证信息
			Student stu = stuS.queryStuByIdAndPasswd(userid, password);
			if (stu != null) { // 有信息
				qv.setStutas(200);
				// 插入openid
				stu.setTgOpenid(openid);
				stuS.uadateStudent(stu);
			} else {// 无信息
				qv.setStutas(500);
			}
		}
		return qv;
	}

	@ResponseBody
	@RequestMapping("/appendUserInfo")
	public ResponseVo appendUserInfo(@RequestParam("openid") String openid, @RequestParam("email") String email,
			@RequestParam("phoner") String phoner, @RequestParam("qq") String qq, @RequestParam("wechat") String wechat,
			@RequestParam("types") String types) {
		ResponseVo qv = new ResponseVo();
		// 判断身份
		if (types.equals("teacher")) {

		} else if (types.equals("student")) {

		}
		return qv;
	}

	@ResponseBody
	@RequestMapping("/test")
	public ResponseVo test(@RequestParam("code") String code, @RequestParam("key") String key,
			@RequestParam("iv") String iv) {
		ResponseVo qv = new ResponseVo();

		// JSONObject userInfo = WechatUtil.accessWechat(code, key, iv);
		// String openid = userInfo.getString("openId");
		String openid = "1";

		Map<String, Object> data = new HashMap<String, Object>();
		Student stu = stuS.queryStuByOpenid(openid);
		if (stu != null) { // 存在绑定，返回个人信息
			qv.setStutas(200);
			List<Student> stus = stuS.selectAndClassByCClassId(stu.getcClassid());
			data.put("is_bind", true);
			data.put("openid", openid);
			List<JSONObject> stuJSON = new ArrayList<JSONObject>();
			for (Student student : stus) {
				JSONObject json = WechatFilter.FilterIsNull(student,
						new String[] { "cClassid", "stuId", "tgIdentifying", "gIdentifying" },
						new String[] { "cClassid", "cId", "tTeacher" });
				stuJSON.add(json);
			}
			data.put("studentInfo", stuJSON);

		} else {// 不存在绑定
			qv.setStutas(200);
			data.put("is_bind", false);
			data.put("openid", openid);
		}
		qv.setData(data);

		// 获得周和星期几
		String date = "2017-09-04";
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Date date1 = null;
		;
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

		return qv;
	}
}
