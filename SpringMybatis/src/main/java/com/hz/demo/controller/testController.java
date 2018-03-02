package com.hz.demo.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hz.demo.dao.LeaderDao;
import com.hz.demo.pojo.Leader;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/tset")
@Api(value="这是一个SpringBootTest Swagger2 接口测试工程", tags={"测试接口"})
public class testController {
	@Resource
	private LeaderDao leaderDao;
	
	public LeaderDao getLeaderDao() {
		return leaderDao;
	}


	public void setLeaderDao(LeaderDao leaderDao) {
		this.leaderDao = leaderDao;
	}


	@GetMapping("test")
	public Map<String, Object> creat(String name, String addres){
		
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("addres", addres);
		return map;
	}
	
	
//	@RequestMapping
	@PostMapping("/save")
	public Map<String, Object> save(String name, String addres){
		List<Leader> li=leaderDao.getLeaderList();
		System.out.println(li);
		Map<String, Object> map = new HashMap<>();
		map.put("name", name);
		map.put("addres", addres);
		return map;
	}
}
