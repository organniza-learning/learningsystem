package com.learningsystem.dao;

import com.learningsystem.pojo.Releaseapplicationcase;
import com.learningsystem.pojo.ReleaseapplicationcaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReleaseapplicationcaseMapper {
    long countByExample(ReleaseapplicationcaseExample example);

    int deleteByExample(ReleaseapplicationcaseExample example);

    int deleteByPrimaryKey(Integer racId);

    int insert(Releaseapplicationcase record);

    int insertSelective(Releaseapplicationcase record);

    List<Releaseapplicationcase> selectByExample(ReleaseapplicationcaseExample example);

    Releaseapplicationcase selectByPrimaryKey(Integer racId);

    int updateByExampleSelective(@Param("record") Releaseapplicationcase record, @Param("example") ReleaseapplicationcaseExample example);

    int updateByExample(@Param("record") Releaseapplicationcase record, @Param("example") ReleaseapplicationcaseExample example);

    int updateByPrimaryKeySelective(Releaseapplicationcase record);

    int updateByPrimaryKey(Releaseapplicationcase record);
}