package com.learningsystem.controller;

import com.learningsystem.pojo.Releasediscussionquestions;
import com.learningsystem.service.ReleasediscussionquestionsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("Releasediscussionquestions")
public class ReleasediscussionquestionsController {

    @Autowired
    ReleasediscussionquestionsService rdqservice;

    @ResponseBody
    @RequestMapping("selectRdqAndTag")
    public List<Releasediscussionquestions> selectRdqAndTag(){
        return rdqservice.selectRdqAndTag();
    }
}
