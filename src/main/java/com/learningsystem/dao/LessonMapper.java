package com.learningsystem.dao;

import com.learningsystem.pojo.Lesson;
import com.learningsystem.pojo.LessonExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LessonMapper {
    long countByExample(LessonExample example);

    int deleteByExample(LessonExample example);

    int deleteByPrimaryKey(Integer lId);

    int insert(Lesson record);

    int insertSelective(Lesson record);

    List<Lesson> selectByExample(LessonExample example);

    Lesson selectByPrimaryKey(Integer lId);

    int updateByExampleSelective(@Param("record") Lesson record, @Param("example") LessonExample example);

    int updateByExample(@Param("record") Lesson record, @Param("example") LessonExample example);

    int updateByPrimaryKeySelective(Lesson record);

    int updateByPrimaryKey(Lesson record);
    //查询班级下的课程
    List<Lesson> findClassLesson(String cClassid);

}