package com.learningsystem.service;

import java.util.List;
import java.util.Map;

import com.learningsystem.pojo.Student;

public interface StudentService {
	// 根据openid查student
	public Student queryStuByOpenid(String openid);
	/**
	 * 根据学号密码查student
	 * @param id
	 * @param password
	 * @return
	 */
	public Student queryStuByIdAndPasswd(String id,String password);
	// 插入openid
	public int uadateStudent(Student stu);
	// 根据班级id连表查询（student和class）
	public List<Student> selectAndClassByCClassId(Integer classid);
}
