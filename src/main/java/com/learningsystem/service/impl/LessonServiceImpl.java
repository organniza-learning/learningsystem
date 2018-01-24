package com.learningsystem.service.impl;

import com.learningsystem.dao.LessonMapper;
import com.learningsystem.pojo.Lesson;
import com.learningsystem.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : YangGuang
 * @Description:课程Service实现层
 * @Date:Created in 17:51 2018/1/24
 * @Modified By:
 **/

@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    LessonMapper lessonMapper;

    /**
    *@Author : YangGuang
    *@Description:查询班级下所有课程
    *@Date:Created in 17:57 2018/1/24
    *@cClassid 班级ID
    **/
    @Override
    public List<Lesson> findClassLesson(String cClassid) {
        return lessonMapper.findClassLesson(cClassid);
    }
}
