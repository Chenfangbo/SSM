package com.cfb.blog.common.util;

import com.github.pagehelper.PageHelper;

/**
 *@describe 
 *@author 臻宝
 *@date 2017年3月26日 下午12:01:50
 */
public class PageUtil {
	
	private static int pageNum = 1; 

	/**
     * 开始分页
     * @param pageNum  页码
     * @param pageSize 每页显示数量
     */
	public static void startPage(int pageNum, int pageSize){
		PageHelper.startPage(pageNum, pageSize);
	}
}
