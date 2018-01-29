package com.learningsystem.service;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import net.sf.json.JSONObject;

public interface IssuesService {
	Integer submitIssues(String openid,String title,String body,String details,String img_url);
	JSONObject queryIssues(String openid,HttpServletRequest request,
			HttpServletResponse response);
	void queryAllIssues();
	void replyIssues(String is_id,String avatar_url,String replyer,String replyerbody);
}
