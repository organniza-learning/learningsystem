package com.learningsystem.dao;

import com.learningsystem.pojo.Rleaseonlinetesting;
import com.learningsystem.pojo.RleaseonlinetestingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
*@Author : YangGuang
*@Description:发布在线测试类dao层接口
*@Date:Created in 12:14 2018/1/7
*
**/
public interface RleaseonlinetestingMapper {
    long countByExample(RleaseonlinetestingExample example);

    int deleteByExample(RleaseonlinetestingExample example);

    int deleteByPrimaryKey(Integer rotId);

    int insert(Rleaseonlinetesting record);

    int insertSelective(Rleaseonlinetesting record);

    List<Rleaseonlinetesting> selectByExample(RleaseonlinetestingExample example);

    Rleaseonlinetesting selectByPrimaryKey(Integer rotId);

    int updateByExampleSelective(@Param("record") Rleaseonlinetesting record, @Param("example") RleaseonlinetestingExample example);

    int updateByExample(@Param("record") Rleaseonlinetesting record, @Param("example") RleaseonlinetestingExample example);

    int updateByPrimaryKeySelective(Rleaseonlinetesting record);

    int updateByPrimaryKey(Rleaseonlinetesting record);
}