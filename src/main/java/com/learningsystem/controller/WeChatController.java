package com.learningsystem.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learningsystem.pojo.Student;
import com.learningsystem.service.StudentService;
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

	@ResponseBody
	@RequestMapping("/decodeUserInfo")
	public ResponseVo decodeUserInfo(@RequestParam("code") String code, @RequestParam("key") String key,
			@RequestParam("iv") String iv) {
		ResponseVo qv = new ResponseVo();

		JSONObject userInfo = WechatUtil.accessWechat(code, key, iv);
		String openid = userInfo.getString("openId");
		//String openid = "1";
		Map<String, Object> data = new HashMap<String, Object>();
		Student stu = stuS.queryStudentByOpenid(openid);

		if (stu != null) { // 存在绑定，返回个人信息
			qv.setStutas(200);
			data.put("is_bind", true);
			data.put("openid", openid);
			data.put("studentInfo", stu);

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
	public ResponseVo bindUserInfo(@RequestParam("openid") String openid, @RequestParam("id") String id,
			@RequestParam("password") String password, @RequestParam("types") String types) {
		ResponseVo qv = new ResponseVo();
		// 判断身份
		Map<String, String> map = new HashMap<String, String>();
		map.put("id", id);
		map.put("password", password);
		// 验证信息
		Student stu = stuS.queryStudentByMap(map);
		if (stu != null) { // 有信息
			qv.setStutas(200);
			// 插入openid
			stu.setTgOpenid(openid);
			stuS.uadateStudent(stu);
		} else {// 无信息
			qv.setStutas(500);
		}
		return qv;
	}
}
