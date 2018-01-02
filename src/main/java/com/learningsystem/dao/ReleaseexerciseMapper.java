package com.learningsystem.dao;

import com.learningsystem.pojo.Releaseexercise;
import com.learningsystem.pojo.ReleaseexerciseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReleaseexerciseMapper {
    long countByExample(ReleaseexerciseExample example);

    int deleteByExample(ReleaseexerciseExample example);

    int deleteByPrimaryKey(Integer reId);

    int insert(Releaseexercise record);

    int insertSelective(Releaseexercise record);

    List<Releaseexercise> selectByExample(ReleaseexerciseExample example);

    Releaseexercise selectByPrimaryKey(Integer reId);

    int updateByExampleSelective(@Param("record") Releaseexercise record, @Param("example") ReleaseexerciseExample example);

    int updateByExample(@Param("record") Releaseexercise record, @Param("example") ReleaseexerciseExample example);

    int updateByPrimaryKeySelective(Releaseexercise record);

    int updateByPrimaryKey(Releaseexercise record);
}