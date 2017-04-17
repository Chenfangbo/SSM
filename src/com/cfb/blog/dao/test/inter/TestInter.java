package com.cfb.blog.dao.test.inter;

import com.cfb.blog.entity.user.UserForm;
import com.github.pagehelper.Page;

/**
 *@describe 
 *@author 臻宝
 *@date 2017年3月22日 下午9:54:35
 */
public interface TestInter {

	//查询USER
	Page<UserForm> selectUserForm();
	
	//
	int insertUser();
}
