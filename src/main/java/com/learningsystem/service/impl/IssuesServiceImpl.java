package com.learningsystem.service.impl;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningsystem.dao.IssuesMapper;
import com.learningsystem.dao.StudentMapper;
import com.learningsystem.pojo.Issues;
import com.learningsystem.pojo.IssuesExample;
import com.learningsystem.pojo.IssuesExample.Criteria;
import com.learningsystem.service.IssuesService;
import com.learningsystem.utils.RemoveNullJsonUtils;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

@Service
public class IssuesServiceImpl implements IssuesService {
	@Autowired
	IssuesMapper im;

	RemoveNullJsonUtils nullJsonUtils = new RemoveNullJsonUtils();

	/**
	 * 提交反馈业务处理 body内容： 反馈2 --- 用户信息** 用户名：陌路（余枫-0104150718） 手机型号：iPhone 6
	 * 操作系统：iOS 10.0.1（devtools - 375x667） 微信版本号：6.5.6 小程序版本号：v0.1.0 基础库版本：1.5.2
	 * 网络类型：wifi, http://ouayrx93b.bkt.clouddn.com/null+2018-01-24zgth0,
	 * http://ouayrx93b.bkt.clouddn.com/null+2018-01-24zgth1
	 */
	public Integer submitIssues(String openid, String title, String body,String details,String img_url) {
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String starttime = dateFormat.format(new Date());

		return im.insertSelective(new Issues(openid, "open", body, title, starttime, img_url,details));
	}

	public JSONObject queryIssues(String openid,HttpServletRequest request,
			HttpServletResponse response) {
		/*
		IssuesExample ie = new IssuesExample();
		Criteria ct = ie.createCriteria();
		ct.andTgOpenidEqualTo(openid);
		List<Issues> list = im.selectByTgOpenid(ie);
		*/
		List<Issues> list = im.selectByTgOpenid(openid);
		JSONArray data = nullJsonUtils.removeBeanNullByArray(list, request, response);
		
		JSONObject jo = new JSONObject();
		if (data != null) { // 有信息
			jo.put("status", 200);
			jo.put("data", data);
		} else {// 无信息
			jo.put("status", 500);
		}
		return jo;
	}

	public void queryAllIssues() {

	}

	public void replyIssues(String is_id, String avatar_url, String replyer, String replyerbody) {

	}

}
