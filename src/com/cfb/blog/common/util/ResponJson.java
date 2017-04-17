package com.cfb.blog.common.util;
/**
 *@describe 返回值JSON类
 *@author 臻宝
 *@date 2017年3月25日 下午10:45:44
 */
public class ResponJson {
	//成功标识
	private boolean isSuccess;
	//返回信息
	private String msg;
	//被操作ID
	private Long id;
	//对象信息
	private Object object;

	public boolean isSuccess() {
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
