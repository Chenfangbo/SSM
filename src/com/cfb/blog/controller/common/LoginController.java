package com.cfb.blog.controller.common;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cfb.blog.entity.user.UserForm;
import com.cfb.blog.service.user.IUserService;

/**
 * @describe 登陆控制器
 * @author 臻宝
 * @date 2017年2月25日 下午8:01:17
 */
@Controller
public class LoginController {

	@Resource
	private IUserService userService;
	
	@RequestMapping("/login")
	public String login(HttpSession session) {
		UserForm userForm = userService.selectUser();
		if(userForm.getUserName().equals("system")){
			session.setAttribute("username", userForm.getUserName());
		}
		return "HelloWorld";
	}
}
