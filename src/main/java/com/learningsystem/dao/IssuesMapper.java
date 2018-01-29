package com.learningsystem.dao;

import com.learningsystem.pojo.Issues;
import com.learningsystem.pojo.IssuesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IssuesMapper {
	
	// 根据openid查询
	List<Issues> selectByTgOpenid(String openid);
	
    long countByExample(IssuesExample example);

    int deleteByExample(IssuesExample example);

    int deleteByPrimaryKey(Integer isId);

    int insert(Issues record);

    int insertSelective(Issues record);

    List<Issues> selectByExample(IssuesExample example);
    
    Issues selectByPrimaryKey(Integer isId);

    int updateByExampleSelective(@Param("record") Issues record, @Param("example") IssuesExample example);

    int updateByExample(@Param("record") Issues record, @Param("example") IssuesExample example);

    int updateByPrimaryKeySelective(Issues record);

    int updateByPrimaryKey(Issues record);
}