package com.cfb.blog.service.user.impl;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cfb.blog.dao.user.UserMapper;
import com.cfb.blog.entity.user.UserForm;
import com.cfb.blog.service.user.IUserService;

/**
 *@describe 
 *@author 臻宝
 *@date 2017年3月13日 下午9:16:43
 */
@Service
public class UserServiceImpl implements IUserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public UserForm selectUser() {
		Map<String, Object> map = new HashMap<String,Object>();
		return (UserForm) userMapper.selectUserForm();
	}

}
