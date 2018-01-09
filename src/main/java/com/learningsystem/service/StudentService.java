package com.learningsystem.service;

import java.util.Map;

import com.learningsystem.pojo.Student;

public interface StudentService {
	// 根据openid查student
	public Student queryStudentByOpenid(String openid);
	// 根据学号密码查student
	public Student queryStudentByMap(Map<String, String> map);
	// 插入openid
	public int uadateStudent(Student stu);
	// 插入openid
}
