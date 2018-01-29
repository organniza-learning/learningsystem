package com.learningsystem.controller;

import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learningsystem.service.IssuesService;
import com.learningsystem.service.StudentService;
import com.learningsystem.wechatUtils.WechatUtil;

import net.sf.json.JSON;
import net.sf.json.JSONObject;

/**
 * @Author : molu
 * @Description:反馈Controller
 * @Date:Created in 21:24 2017/01/22
 *
 **/
@Controller
@RequestMapping("Issues")
public class IssuesController {
	@Autowired
	IssuesService iS;

	/**
	 * @Author : molu
	 * @Description:用户提交反馈
	 * @Date:Created in 09:38 2017/01/22
	 * 
	 * @param openid
	 * @param title
	 * @param body
	 * @param request
	 * @param response
	 * 
	 * @return josn
	 */
	@ResponseBody
	@RequestMapping("/submitIssues")
	public JSONObject submitIssues(@RequestParam("openid") String openid, @RequestParam("title") String title,
			@RequestParam("body") String body, @RequestParam("details") String details,
			@RequestParam("img_url") String img_url, HttpServletRequest request, HttpServletResponse response) {
		JSONObject jo = new JSONObject();
		int i = iS.submitIssues(openid, title, body,details,img_url);
		if (i == 1) {
			jo.put("status", 200);
			jo.put("data", new JSONObject().put("html_url", "暂无"));
		} else {
			jo.put("status", 500);
		}

		return jo;
	}

	/**
	 * @Author : molu
	 * @Description:用户查询反馈
	 * @Date:Created in 09:38 2017/01/22
	 * 
	 * @param openid
	 * @param request
	 * @param response
	 * @return josn
	 */
	@ResponseBody
	@RequestMapping("/queryIssues")
	public JSONObject queryIssues(@RequestParam("openid") String openid, HttpServletRequest request,
			HttpServletResponse response) {
		return iS.queryIssues(openid, request, response);
	}

	/**
	 * @Author : molu
	 * @Description:查询所有反馈
	 * @Date:Created in 09:38 2017/01/22
	 * @param request
	 * @param response
	 * @return josn
	 */
	@ResponseBody
	@RequestMapping("/queryAllIssues")
	public JSONObject queryAllIssues(HttpServletRequest request, HttpServletResponse response) {

		return null;
	}

	/**
	 * @Author : molu
	 * @Description:管理者回复反馈
	 * @Date:Created in 09:38 2017/01/22
	 * 
	 * @param is_id
	 * @param avatar_url
	 * @param replyer
	 * @param replyerbody
	 * @param request
	 * @param response
	 * @return josn
	 */
	@ResponseBody
	@RequestMapping("/replyIssues")
	public JSONObject replyIssues(@RequestParam("is_id") String is_id, @RequestParam("avatar_url") String avatar_url,
			@RequestParam("replyer") String replyer, @RequestParam("replyerbody") String replyerbody,
			HttpServletRequest request, HttpServletResponse response) {

		return null;
	}

}
