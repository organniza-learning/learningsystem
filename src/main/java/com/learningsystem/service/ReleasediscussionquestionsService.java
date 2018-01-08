package com.learningsystem.service;

import com.learningsystem.pojo.Releasediscussionquestions;
import com.learningsystem.service.iml.ReleasediscussionquestionsServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *@Author : YangGuang
 *@Description:发布学习内容接口
 *@Date:Created in 12:17 2018/1/7
 *
 **/
public interface ReleasediscussionquestionsService {

   List<Releasediscussionquestions> selectRdqAndTag();

}
