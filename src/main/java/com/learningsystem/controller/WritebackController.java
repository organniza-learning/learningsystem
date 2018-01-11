package com.learningsystem.controller;

import com.learningsystem.pojo.Writeback;
import com.learningsystem.service.WritebackService;
import com.learningsystem.utils.RemoveNullJsonUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JsonConfig;
import net.sf.json.util.PropertyFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;

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


    RemoveNullJsonUtils removeNullJsonUtils = new RemoveNullJsonUtils();


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
        return writebackService.insertWritebackCount(rdqId);
    }

    /**
     *@Author : YangGuang
     *@Description:点击进入获取数据该帖子
     *@Date:Created in 14:50 2018/1/10
     *@rdqId 该张帖子的ID
     **/
    @ResponseBody
    @RequestMapping(value = "selectRdqAndWrite",method = RequestMethod.GET)
    public JSONObject selectRdqAndWrite(@RequestParam(value = "rdqId") Integer rdqId, HttpServletRequest request, HttpServletResponse response){
        List<Writeback> list = writebackService.selectRdqAndWrite(rdqId);
        JSONObject jsonObject = removeNullJsonUtils.removeBeanNull(list, request, response);
        return jsonObject;
    }

    /**
    *@Author : YangGuang
    *@Description:插入回复功能
    *@Date:Created in 21:43 2018/1/10
    *
    **/
    @RequestMapping(value = "replyMessage",method = RequestMethod.POST)
    @ResponseBody
    public String replyMessage(HttpServletRequest request, HttpServletResponse response,@RequestParam("rdqId")Integer rdqId,
                               @RequestParam("content")String content,@RequestParam("file")MultipartFile file){
        return writebackService.replyMessage(rdqId,content,file);
    }
}
