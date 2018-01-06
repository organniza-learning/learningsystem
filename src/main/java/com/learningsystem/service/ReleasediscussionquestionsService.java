package com.learningsystem.service;

import com.learningsystem.pojo.Releasediscussionquestions;
import com.learningsystem.service.iml.ReleasediscussionquestionsServiceIml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleasediscussionquestionsService {

    @Autowired
    ReleasediscussionquestionsServiceIml releasediscussionquestionsServiceIml;

   public List<Releasediscussionquestions> selectRdqAndTag(){
        return releasediscussionquestionsServiceIml.selectRdqAndTag();
    }
}
