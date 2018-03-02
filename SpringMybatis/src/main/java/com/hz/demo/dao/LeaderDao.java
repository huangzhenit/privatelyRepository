package com.hz.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.hz.demo.pojo.Leader;

public interface LeaderDao {
	
	@Select("select * from leader")
	List<Leader> getLeaderList();
}
