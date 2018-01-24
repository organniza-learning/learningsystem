package com.learningsystem.controller;

import com.learningsystem.pojo.Lesson;
import com.learningsystem.service.LessonService;
import com.learningsystem.utils.RemoveNullJsonUtils;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author : YangGuang
 * @Description:班级课程查询
 * @Date:Created in 17:42 2018/1/24
 * @Modified By:
 **/

@Controller
@RequestMapping("Lesson")
public class LessonController {

    @Autowired
    LessonService lessonService;

    RemoveNullJsonUtils removeNullJsonUtils = new RemoveNullJsonUtils();

    /**
    *@Author : YangGuang
    *@Description:查询该班级下所有课程
    *@Date:Created in 17:42 2018/1/24
    *
    **/
    @RequestMapping("findClassLesson")
    @ResponseBody
    public JSONObject findClassLesson(@RequestParam("cClassid") String cClassid, HttpServletRequest request, HttpServletResponse response){
        List<Lesson> lesson = lessonService.findClassLesson(cClassid);
        JSONObject jsonObject = new JSONObject();
        if(lesson!=null){
            jsonObject.put("status",200);
            //去除pojo中null值
            jsonObject.put("data",removeNullJsonUtils.removeBeanNullByArray(lesson,request,response));
        }else{
            jsonObject.put("status",500);
        }
        return jsonObject;
    }
}
