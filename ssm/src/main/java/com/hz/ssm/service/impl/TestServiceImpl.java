package com.hz.ssm.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.hz.ssm.mapper.LeaderMapper;
import com.hz.ssm.pojo.Leader;
import com.hz.ssm.pojo.LeaderExample;
import com.hz.ssm.service.ITestService;
@Service
public class TestServiceImpl implements ITestService{

	@Resource
	private LeaderMapper leaderMapper;
	@Override
	public List<Leader> selectByExample() {
		return leaderMapper.selectByExample(null);
	}
	
}
