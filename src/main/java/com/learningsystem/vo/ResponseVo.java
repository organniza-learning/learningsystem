package com.learningsystem.vo;

import java.util.Map;

public class ResponseVo {
	public Integer stutas;
	public Map<String, Object> data;
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
	
	
}
