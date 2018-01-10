package com.learningsystem.vo;

import java.util.HashMap;
import java.util.Map;

public class ResponseVo {
	public Integer stutas;//状态码

	public Map<String, Object> data;//map集合存储数据

	//用户要返回给浏览器的数据
	private Map<String,Object> extend = new HashMap<String, Object>();

	public Map<String, Object> getExtend() {
		return extend;
	}

	public void setExtend(Map<String, Object> extend) {
		this.extend = extend;
	}

	public Integer getStutas() {
		return stutas;
	}
	public void setStutas(Integer stutas) {
		this.stutas = stutas;
	}
	
	public Map<String, Object> getData() {
		return data;
	}
	public void setData(Map<String, Object> data) {
		this.data = data;
	}
	
	public ResponseVo(Integer stutas, Map<String, Object> data) {
		super();
		this.stutas = stutas;
		this.data = data;
	}
	public ResponseVo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ResponseVo add(String key, Object value) {
		this.getExtend().put(key, value);
		return this;
	}
}
