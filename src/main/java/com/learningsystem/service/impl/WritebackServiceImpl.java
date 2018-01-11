package com.learningsystem.service.impl;

import com.learningsystem.dao.WritebackMapper;
import com.learningsystem.pojo.Writeback;
import com.learningsystem.service.WritebackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

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
    **/
    @Override
    public int insertWritebackCount(Integer rdqId) {
        return writebackMapper.insertWritebackCount(rdqId);
    }

    @Override
    public List<Writeback> selectRdqAndWrite(Integer rdqId) {
        return writebackMapper.selectRdqAndWrite(rdqId);
    }

    @Override
    public String replyMessage(Integer rdqId, String content, MultipartFile file) {
        return null;
    }
}
