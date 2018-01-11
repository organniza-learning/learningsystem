package com.learningsystem.service.impl;



import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learningsystem.dao.StudentMapper;
import com.learningsystem.pojo.Student;
import com.learningsystem.pojo.StudentExample;
import com.learningsystem.pojo.StudentExample.Criteria;
import com.learningsystem.service.StudentService;
import com.learningsystem.utils.ExploitUtil;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentMapper sm;

	public Student queryStuByOpenid(String openid) {
		StudentExample se = new StudentExample();
		Criteria ct = se.createCriteria();
		ct.andTgOpenidEqualTo(openid);
		return ExploitUtil.stuIsNull(sm, se);
	}

	public int uadateStudent(Student stu) {
		// TODO Auto-generated method stub
		return sm.updateByPrimaryKey(stu);
	}

	public Student queryStuByIdAndPasswd(String id, String password) {
		StudentExample se = new StudentExample();
		Criteria ct = se.createCriteria();
		ct.andStuStudentidEqualTo(id);
		ct.andStuPasswordEqualTo(password);
		return ExploitUtil.stuIsNull(sm, se);
	}
	// 根据班级id连表查询（student和class）
	public List<Student> selectAndClassByCClassId(Integer classid) {
		return sm.selectAndClassByCClassId(classid);
	}


}
