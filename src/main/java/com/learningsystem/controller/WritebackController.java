package com.learningsystem.controller;

import com.learningsystem.pojo.Writeback;
import com.learningsystem.service.WritebackService;
import com.learningsystem.utils.LearningUtils;
import com.learningsystem.utils.RemoveNullJsonUtils;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
    public JSONObject selectRdqAndWrite(@RequestParam(value = "rdqId") String rdqId, HttpServletRequest request, HttpServletResponse response){
        List<Writeback> list = writebackService.selectRdqAndWrite(rdqId);
        return removeNullJsonUtils.removeBeanNull(list, request, response);
    }

    /**
    *@Author : YangGuang
    *@Description:插入回复功能
    *@Date:Created in 21:43 2018/1/10
    *页面发送文件必须带上enctype=multipart/form-data属性
     * 去掉RequestBody注解
     * 使用在进行图片或者文件上传时 multipart/form-data 类型时、
     * 数据会自动进行映射不要添加任何注解。此处解释不知道正确不、欢迎指正。
    **/
    @RequestMapping(value = "replyMessage",method = RequestMethod.POST)
    @ResponseBody
    public JSONObject replyMessage(HttpServletRequest request, HttpServletResponse response,@RequestParam("file")MultipartFile file,Writeback writeback){

        System.err.println("rdqId:" + writeback.getRdqId() + "\n"+ "stuStudentid:" + writeback.getStuStudentid() + "\n"
                            +"content: " + writeback.getWbContent() + "\n"+ "file: " + file);

        JSONObject jsonObject = new JSONObject();
        //插入回复
        jsonObject.put("插入记录",writebackService.replyMessage(request,response,writeback,file));
        //统计回复条数
        jsonObject.put("统计记录",writebackService.insertWritebackCount(writeback.getRdqId()));

         return jsonObject;
    }
}
