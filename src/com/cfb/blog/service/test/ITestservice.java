package com.cfb.blog.service.test;

import com.cfb.blog.entity.user.UserForm;
import com.github.pagehelper.Page;

/**
 *@describe 
 *@author 臻宝
 *@date 2017年3月22日 下午9:57:46
 */
public interface ITestservice {

	Page<UserForm> selectUser();
	
	public int insertUser() throws Exception;
}
