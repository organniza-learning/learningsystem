package com.learningsystem.service;

import com.learningsystem.pojo.Writeback;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * @Author : YangGuang
 * @Description:问题回复Service层
 * @Date:Created in 9:17 2018/1/8
 * @Modified By:
 **/
public interface WritebackService {

    //更新回复数据
    int insertWritebackCount(Integer rdqId);
    //查询该贴内容
    List<Writeback> selectRdqAndWrite(Integer rdqId);
    //回复该贴
    String replyMessage(Integer rdqId, String content, MultipartFile file);
}
