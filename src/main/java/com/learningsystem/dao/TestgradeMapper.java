package com.learningsystem.dao;

import com.learningsystem.pojo.Testgrade;
import com.learningsystem.pojo.TestgradeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestgradeMapper {
    long countByExample(TestgradeExample example);

    int deleteByExample(TestgradeExample example);

    int deleteByPrimaryKey(Integer tgId);

    int insert(Testgrade record);

    int insertSelective(Testgrade record);

    List<Testgrade> selectByExample(TestgradeExample example);

    Testgrade selectByPrimaryKey(Integer tgId);

    int updateByExampleSelective(@Param("record") Testgrade record, @Param("example") TestgradeExample example);

    int updateByExample(@Param("record") Testgrade record, @Param("example") TestgradeExample example);

    int updateByPrimaryKeySelective(Testgrade record);

    int updateByPrimaryKey(Testgrade record);
}