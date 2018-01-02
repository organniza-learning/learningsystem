package com.learningsystem.dao;

import com.learningsystem.pojo.Grouping;
import com.learningsystem.pojo.GroupingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupingMapper {
    long countByExample(GroupingExample example);

    int deleteByExample(GroupingExample example);

    int deleteByPrimaryKey(Integer gId);

    int insert(Grouping record);

    int insertSelective(Grouping record);

    List<Grouping> selectByExample(GroupingExample example);

    Grouping selectByPrimaryKey(Integer gId);

    int updateByExampleSelective(@Param("record") Grouping record, @Param("example") GroupingExample example);

    int updateByExample(@Param("record") Grouping record, @Param("example") GroupingExample example);

    int updateByPrimaryKeySelective(Grouping record);

    int updateByPrimaryKey(Grouping record);
}