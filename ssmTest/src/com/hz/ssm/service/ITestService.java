package com.hz.ssm.service;

import java.util.List;

import com.hz.ssm.pojo.Leader;

public interface ITestService {
	List<Leader> selectByExample();
	Leader selectByPrimaryKey(Integer id);
}
