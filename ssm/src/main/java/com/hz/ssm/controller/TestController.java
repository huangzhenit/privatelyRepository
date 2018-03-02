package com.hz.ssm.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hz.ssm.pojo.Leader;
import com.hz.ssm.service.ITestService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Controller
@Api(value="测试一下", tags={"测试接口"})
public class TestController {
	@Resource
	private ITestService testServiceImpl;
	
	@ApiOperation("列表12") 
	@RequestMapping(value="/userList", method = RequestMethod.GET,produces = "application/json;charset=utf-8") 
	@ResponseBody   
    public List<Leader> userList(){   
		 System.out.println(testServiceImpl.selectByExample());
        return    testServiceImpl.selectByExample();
    }   
	
	@ApiOperation("跳转页面测试") 
	@RequestMapping(value="/test", method = RequestMethod.GET) 
    public String test(){   
		 System.out.println(testServiceImpl.selectByExample());
        return "index";
    }  
}
