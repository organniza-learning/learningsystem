package com.learningsystem.service.iml;

import com.learningsystem.dao.ReleasediscussionquestionsMapper;
import com.learningsystem.pojo.Releasediscussionquestions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReleasediscussionquestionsServiceIml {

    @Autowired
    ReleasediscussionquestionsMapper mapper;

    public List<Releasediscussionquestions> selectRdqAndTag() {
        return mapper.selectRdqAndTag();
    }
}
