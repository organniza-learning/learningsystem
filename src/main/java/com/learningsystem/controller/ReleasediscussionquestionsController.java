package com.learningsystem.controller;

import com.learningsystem.pojo.Releasediscussionquestions;
import com.learningsystem.service.ReleasediscussionquestionsService;
import com.learningsystem.utils.RemoveNullJsonUtils;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
     *@Pram:查询问题讨论列表以及标签和回复记录和对应课程名称
     *@Date:Created in 21:25 2018/1/6
     *
     **/
    @ResponseBody
    @RequestMapping(value = "selectRdqAndTag",method = RequestMethod.GET)//查询问题讨论及关联的标签和回复记录
    public JSONObject selectRdqAndTag(HttpServletRequest request, HttpServletResponse response){
        RemoveNullJsonUtils removeNullJsonUtils = new RemoveNullJsonUtils();
        JSONObject jsonObject = new JSONObject();
        List<Releasediscussionquestions> list = rdqservice.selectRdqAndTag();
        System.err.println("list:" + list);
        if (list!=null){
            //查询问题讨论列表总数据，排序按时间降序，最新在前面
            removeNullJsonUtils.removeBeanNull(list,request,response);
            jsonObject.put("data",removeNullJsonUtils.removeBeanNull(list,request,response));
        }else {
            jsonObject.put("stutas","500");
        }
        return jsonObject;
    }



}
