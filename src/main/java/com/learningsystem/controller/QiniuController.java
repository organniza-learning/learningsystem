package com.learningsystem.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learningsystem.utils.QiniuUtil;

import net.sf.json.JSONObject;

@Controller
@RequestMapping("Qiniu")
public class QiniuController {
	QiniuUtil qiniuUtil = new QiniuUtil();
	/**
	 * @Author : YangGuang
	 * @Description:查询该班级下所有课程
	 * @Date:Created in 17:42 2018/1/24
	 *
	 **/
	@RequestMapping("getUploadToken")
	@ResponseBody
	public JSONObject getUploadToken(@RequestParam("fileType") String fileType, @RequestParam("fileUse") String fileUse,HttpServletRequest request,
			HttpServletResponse response) {
		JSONObject jo = new JSONObject();
		jo.put("status", 200);
		JSONObject data = new JSONObject();
		data.put("token", qiniuUtil.getUpToken());
		data.put("filename", qiniuUtil.getFileName(fileType, fileUse));
		jo.put("data", data);
		return jo;		
	}
}
