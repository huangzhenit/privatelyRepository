package com.hz.ssm.mapper;

import com.hz.ssm.pojo.Leader;
import com.hz.ssm.pojo.LeaderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LeaderMapper {
    int countByExample(LeaderExample example);

    int deleteByExample(LeaderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Leader record);

    int insertSelective(Leader record);

    List<Leader> selectByExample(LeaderExample example);

    Leader selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Leader record, @Param("example") LeaderExample example);

    int updateByExample(@Param("record") Leader record, @Param("example") LeaderExample example);

    int updateByPrimaryKeySelective(Leader record);

    int updateByPrimaryKey(Leader record);
}