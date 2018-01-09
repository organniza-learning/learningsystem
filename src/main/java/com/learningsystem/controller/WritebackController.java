package com.learningsystem.controller;

import com.learningsystem.pojo.Releasediscussionquestions;
import com.learningsystem.service.WritebackService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : YangGuang
 * @Description:问题讨论回复Controller
 * @Date:Created in 9:03 2018/1/8
 * @Modified By:
 **/

@Controller
@RequestMapping("Writeback")
public class WritebackController {

    @Autowired
    private WritebackService writebackService;

    /**
    *@Author : YangGuang
    *@Description:自更新回复表，统计回复条数
    *@Date:Created in 9:13 2018/1/8
    *
    **/

    @RequestMapping(value = "insertWritebackCount",method = RequestMethod.GET)
    @ResponseBody
    public int insertWritebackCount(@RequestParam("rdqId") Integer rdqId){
        /**
         * rdqId 该问题发起者的表ID，表为 Releasediscussionquestions 中的 RDQ_ID
         *  ----------该用户回复之后需要加载此方法，以便数据实时显示-----------
        */
        System.err.println("return rdqId : " + rdqId);
        return writebackService.insertWritebackCount(rdqId);

    }
}
