package com.learningsystem.controller;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
import com.learningsystem.utils.RemoveNullJsonUtils;
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
	public JSONObject decodeUserInfo(@RequestParam("code") String code, @RequestParam("key") String key,
			@RequestParam("iv") String iv,HttpServletRequest request,HttpServletResponse response) {

		JSONObject userInfo = WechatUtil.accessWechat(code, key, iv);
		String openid = userInfo.getString("openId");
		JSONObject json = stuS.getUserInfo(openid, request, response);
		
		return json;
	}
	/**
	 * 绑定接口
	 * @param openid
	 * @param userid
	 * @param password
	 * @param types
	 * @param request
	 * @param response
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/bindUserInfo")
	public JSONObject bindUserInfo(@RequestParam("openid") String openid, @RequestParam("userid") String userid,
			@RequestParam("password") String password, @RequestParam("types") String types,HttpServletRequest request,HttpServletResponse response) {
		
		JSONObject json = stuS.isUserByIdAndPasswd(openid, userid, password, types, request, response);

		return json;
	}
	/**
	 * 附加信息接口
	 * @param openid
	 * @param email
	 * @param phoner
	 * @param qq
	 * @param wechat
	 * @param types
	 * @return
	 */
	@ResponseBody
	@RequestMapping("/appendUserInfo")
	public JSONObject appendUserInfo(@RequestParam("openid") String openid, @RequestParam("email") String email,
			@RequestParam("phone") String phone, @RequestParam("qq") String qq, @RequestParam("wechat") String wechat,
			@RequestParam("types") String types) {
		JSONObject json = null;
		if(types.equals("student")){
			Student stu = new Student();
			stu.setStuEmail(email);
			stu.setStuPhoner(phone);
			stu.setStuQq(qq);
			stu.setStuWechat(wechat);
			
			json = stuS.appendUserInfo(openid, stu);
		}else if(types=="teacher"){
			
		}
	
		return json;
	}
	
	@ResponseBody
	@RequestMapping("/test")
	public JSONObject test(@RequestParam("code") String code, @RequestParam("key") String key,
			@RequestParam("iv") String iv,HttpServletRequest request,HttpServletResponse response) {
		
		String openid = "1";
		JSONObject json = stuS.getUserInfo(openid, request, response);
		
		return json;
	}
}
