package com.cfb.blog.service.test.impl;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cfb.blog.dao.test.inter.TestInter;
import com.cfb.blog.entity.user.UserForm;
import com.cfb.blog.service.test.ITestservice;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

/**
 *@describe 
 *@author 臻宝
 *@date 2017年3月22日 下午9:58:33
 */
@Service
@Transactional
public class TestServiceImpl implements ITestservice{
	
	private Logger logger = Logger.getLogger(TestServiceImpl.class);

	@Resource
	private TestInter test;
	
	@Override
	public Page<UserForm> selectUser() {
		PageHelper.startPage(1, 10);
		return (Page<UserForm>) test.selectUserForm();
	}

	@Override
	public int insertUser() throws Exception{
		int i = test.insertUser();
		System.out.println("第一次更新...");
		int a = 10/0;
		int j = test.insertUser();
		System.out.println("第二次更新...");
		return i;
	}
}
