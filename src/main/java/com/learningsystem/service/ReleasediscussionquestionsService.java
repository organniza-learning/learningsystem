package com.learningsystem.service;

import com.learningsystem.pojo.Releasediscussionquestions;

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
