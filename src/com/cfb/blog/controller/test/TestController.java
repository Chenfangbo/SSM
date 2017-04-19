package com.cfb.blog.controller.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cfb.blog.common.util.RequestCommon;
import com.cfb.blog.entity.user.UserForm;
import com.cfb.blog.service.test.ITestservice;
import com.github.pagehelper.Page;

@Controller
public class TestController {

	@Resource
	private ITestservice testservice;
	
	/**
	 *@describe SpringMVC练习
	 *@author 臻宝
	 *@date 2017年2月25日 下午5:43:44
	 */
	@RequestMapping("/testController")
	public String testController(){
		System.out.println("HI...@_@...!");
		return "HelloWorld";
	}
	
	@RequestMapping("/getFullName")
	public String getFullName(){
		RequestCommon requestCommon = null;
		Page<UserForm> userForm = testservice.selectUser();
		System.out.println(userForm.get(0).getFullName());
		return "HelloWorld";
	}
	
	@RequestMapping("/insertUser")
	public String insertUser() {
		try {
			int i = testservice.insertUser();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "HelloWorld";
	}
}
