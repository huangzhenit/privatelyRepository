package com.hz.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hz.ssm.pojo.Leader;
import com.hz.ssm.service.ITestService;

@Controller
public class TestController {
	@Resource
	private ITestService testServiceImpl;
	
	@RequestMapping("/userList") 
	@ResponseBody   
    public List<Leader> userList(){   
		 System.out.println(testServiceImpl.selectByExample());
        return    testServiceImpl.selectByExample();
    }   
	@RequestMapping("/user") 
	@ResponseBody   
    public Leader user(){   
        return    testServiceImpl.selectByPrimaryKey(1);
    }  
}
