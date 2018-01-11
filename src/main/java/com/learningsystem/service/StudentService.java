package com.learningsystem.service;

import java.util.Map;

import com.learningsystem.pojo.Student;
import com.learningsystem.vo.ResponseVo;

public interface StudentService {
	// 根据openid查student
	Student queryStudentByOpenid(String openid);
	// 根据学号密码查student
	Student queryStudentByMap(Map<String, String> map);
	// 插入openid
	int uadateStudent(Student stu);


}
