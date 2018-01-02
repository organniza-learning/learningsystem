package com.learningsystem.dao;

import com.learningsystem.pojo.Writeback;
import com.learningsystem.pojo.WritebackExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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
}