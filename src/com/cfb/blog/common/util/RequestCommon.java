package com.cfb.blog.common.util;

import java.util.Map;

/**
 *@describe 
 *@author 臻宝
 *@date 2017年3月26日 下午12:01:50
 */
public class RequestCommon {
	//当前页
	private int pageNum = 1; 
	//每页展示数量
	private int pageSize = 10;
	//存放参数
	private Map<String,Object> param;
	
	
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public Map<String, Object> getParam() {
		return param;
	}
	public void setParam(Map<String, Object> param) {
		this.param = param;
	}


}
