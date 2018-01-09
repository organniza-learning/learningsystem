package com.learningsystem.service.iml;

import com.learningsystem.dao.WritebackMapper;
import com.learningsystem.service.WritebackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : YangGuang
 * @Description:问题回复表实现类
 * @Date:Created in 9:19 2018/1/8
 * @Modified By:
 **/
@Service
public class WritebackServiceIml implements WritebackService {

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
}
