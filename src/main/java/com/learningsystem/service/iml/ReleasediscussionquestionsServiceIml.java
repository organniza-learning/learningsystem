package com.learningsystem.service.iml;

import com.learningsystem.dao.ReleasediscussionquestionsMapper;
import com.learningsystem.pojo.Releasediscussionquestions;
import com.learningsystem.service.ReleasediscussionquestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
*@Author : YangGuang
*@Description:发布问题讨论Service实现类
*@Date:Created in 12:18 2018/1/7
*
**/
@Service
public class ReleasediscussionquestionsServiceIml implements ReleasediscussionquestionsService {

    @Autowired
    ReleasediscussionquestionsMapper mapper;

    public List<Releasediscussionquestions> selectRdqAndTag() {
        return mapper.selectRdqAndTag();
    }
}
