package com.learningsystem.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;

import com.learningsystem.pojo.Student;

import net.sf.json.JSONObject;

public interface StudentService {
	/**
	 * 根据学号密码查student
	 * @param id
	 * @param password
	 * @return
	 */
	public JSONObject isUserByIdAndPasswd(String openid, String userid,
			 String password, String types,HttpServletRequest request,HttpServletResponse response);
	
	public JSONObject getUserInfo(String openid,HttpServletRequest request,HttpServletResponse response);
	/**
	 * 附加用户信息
	 * @param openid
	 * @param stu
	 * @return
	 */
	public JSONObject appendUserInfo(String openid,Student stu);
}
