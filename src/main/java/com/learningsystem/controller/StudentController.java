package com.learningsystem.controller;

import com.learningsystem.pojo.Student;
import com.learningsystem.service.impl.StudentServiceImpl;
import com.learningsystem.vo.ResponseVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : YangGuang
 * @Description:学生表Controller
 * @Date:Created in 9:41 2018/1/10
 * @Modified By: 转交给余枫
 **/
@Controller
@RequestMapping("StuController")
public class StudentController {

    /*@Autowired
    StudentServiceImpl studentService;
    @Autowired
    Student students;

    ResponseVo responseVo = new ResponseVo();

    @ResponseBody
    @RequestMapping("insertStuInfo")
    public ResponseVo insertStuInfo(@RequestBody Student student){
        //判断用户....
        //if(){}.....
        Integer num = studentService.insertStuInfo(student);
        if (num!=null){
            responseVo.stutas = 200;
            responseVo.add("A",num).add("B",num);
        }else {
            responseVo.add("error","用户数据插入失败");
        }
        return responseVo;
    }*/
}
