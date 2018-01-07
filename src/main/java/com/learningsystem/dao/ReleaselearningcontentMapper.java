package com.learningsystem.dao;

import com.learningsystem.pojo.Releaselearningcontent;
import com.learningsystem.pojo.ReleaselearningcontentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
*@Author : YangGuang
*@Description:发布学习内容类dao层接口
*@Date:Created in 12:14 2018/1/7
*
**/
public interface ReleaselearningcontentMapper {
    long countByExample(ReleaselearningcontentExample example);

    int deleteByExample(ReleaselearningcontentExample example);

    int deleteByPrimaryKey(Integer rlcId);

    int insert(Releaselearningcontent record);

    int insertSelective(Releaselearningcontent record);

    List<Releaselearningcontent> selectByExample(ReleaselearningcontentExample example);

    Releaselearningcontent selectByPrimaryKey(Integer rlcId);

    int updateByExampleSelective(@Param("record") Releaselearningcontent record, @Param("example") ReleaselearningcontentExample example);

    int updateByExample(@Param("record") Releaselearningcontent record, @Param("example") ReleaselearningcontentExample example);

    int updateByPrimaryKeySelective(Releaselearningcontent record);

    int updateByPrimaryKey(Releaselearningcontent record);
}