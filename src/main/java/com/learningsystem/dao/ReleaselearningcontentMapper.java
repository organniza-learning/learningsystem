package com.learningsystem.dao;

import com.learningsystem.pojo.Releaselearningcontent;
import com.learningsystem.pojo.ReleaselearningcontentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

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