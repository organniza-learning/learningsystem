package com.learningsystem.dao;

import com.learningsystem.pojo.Writeback;
import com.learningsystem.pojo.WritebackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
*@Author : YangGuang
*@Description:问题讨论回复类dao层接口
*@Date:Created in 12:15 2018/1/7
*
**/
public interface WritebackMapper {
    long countByExample(WritebackExample example);

    int deleteByExample(WritebackExample example);

    int deleteByPrimaryKey(Integer wbId);

    int insert(Writeback record);

    int insertSelective(Writeback record);

    List<Writeback> selectByExample(WritebackExample example);

    Writeback selectByPrimaryKey(Integer wbId);

    int updateByExampleSelective(@Param("record") Writeback record, @Param("example") WritebackExample example);

    int updateByExample(@Param("record") Writeback record, @Param("example") WritebackExample example);

    int updateByPrimaryKeySelective(Writeback record);

    int updateByPrimaryKey(Writeback record);

    //自更新回复表统计回复数量
    void insertWritebackCount(Integer rdqId);
}