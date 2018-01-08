package com.learningsystem.controller;

import com.learningsystem.pojo.Releasediscussionquestions;
import com.learningsystem.service.ReleasediscussionquestionsService;
import com.learningsystem.service.iml.ReleasediscussionquestionsServiceIml;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
*@Author : YangGuang
*@Description:问题发布讨论Controller
*@Date:Created in 21:24 2017/01/03
*
**/
@Controller
@RequestMapping("Releasediscussionquestions")
public class ReleasediscussionquestionsController {

    @Autowired
    ReleasediscussionquestionsService rdqservice;

    /**
    *@Author : YangGuang
    *@Pram:查询问题讨论列表以及标签
    *@Date:Created in 21:25 2018/1/6
    *
    **/
    @ResponseBody
    @RequestMapping(value = "selectRdqAndTag",method = RequestMethod.GET)//查询问题讨论及关联的标签和回复记录
    public List<Releasediscussionquestions> selectRdqAndTag(){
        //查询问题讨论列表总数据，不用判断用户
        return rdqservice.selectRdqAndTag();
    }

}
