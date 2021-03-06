package com.learningsystem.dao;

import com.learningsystem.pojo.Student;
import com.learningsystem.pojo.StudentExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

/**
*@Author : YangGuang
*@Description:学生类dao层接口
*@Date:Created in 13:13 2018/1/7
*
**/
public interface StudentMapper {
	
	// 根据班级id连表查询（student和class）
	List<Student> selectAndClassByCClassId(Integer classid);
    // 验证账号密码
    Student selectByIdAndPassword(Map<String, String> map);
    
    long countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer stuId);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer stuId);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}