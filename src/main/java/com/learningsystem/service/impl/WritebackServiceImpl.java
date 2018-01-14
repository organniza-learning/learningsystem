package com.learningsystem.service.impl;

import com.learningsystem.dao.WritebackMapper;
import com.learningsystem.pojo.Writeback;
import com.learningsystem.service.WritebackService;
import com.learningsystem.utils.LearningUtils;
import com.learningsystem.utils.UploadFileUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * @Author : YangGuang
 * @Description:问题回复表实现类
 * @Date:Created in 9:19 2018/1/8
 * @Modified By:
 **/
@Service
public class WritebackServiceImpl implements WritebackService {

    @Autowired
    private WritebackMapper writebackMapper;


    /**
    *@Author : YangGuang
    *@Description:实现回复类接口insertWritebackCount统计方法
    *@Date:Created in 12:50 2018/1/8
    *
    *
     * @param rdqId*/
    public int insertWritebackCount(Integer rdqId) {
        return writebackMapper.insertWritebackCount(rdqId);
    }

    public List<Writeback> selectRdqAndWrite(String rdqId) {
        return writebackMapper.selectRdqAndWrite(rdqId);
    }

    /**
    *@Author : YangGuang
    *@Description:回复并统计
    *@Date:Created in 20:03 2018/1/14
    *
    **/
    public String replyMessage(HttpServletRequest request, HttpServletResponse response, Writeback writeback ,MultipartFile file) {
        UploadFileUtils uploadFileUtils = new UploadFileUtils();
        LearningUtils learningUtils = new LearningUtils();
        com.alibaba.fastjson.JSONObject pathjson = uploadFileUtils.filesUpload(request,response,file);
        String path = (String) pathjson.get("path");
        writeback.setWbUploadfile(path);
        writeback.setWbTime(learningUtils.date_yyyy_mm_dd());
        System.err.println("writeback : "+ writeback.toString());
        int i = writebackMapper.replyMessage(writeback);
        return String.valueOf(i);
    }
}
