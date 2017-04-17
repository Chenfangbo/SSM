package com.cfb.blog.common.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

/**
 *@describe Spring框架提供的拦截器
 *@author 臻宝
 *@date 2017年3月25日 下午3:53:15
 */
public class LoginInterceptor implements HandlerInterceptor {

	/**
	 * 在完全处理完请求之后被调用,可用于清理资源
	 * */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object object, Exception exception)
			throws Exception {
		
	}

	/**
	 * 业务处理器请求结束之后,生成视图之前执行
	 * */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object object, ModelAndView modelAndView)
			throws Exception {
		
	}

	/**
	 * 业务处理器处理请求之前调用(执行Controller之前)
	 * */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object object) throws Exception {
		/*对公共资源进行判断放行*/
		String url = request.getRequestURI();
		if(url.indexOf("login")>0){
			return true;
		}
		/*非公共资源的业务请求判断用户是否登陆*/
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		if(username == null){
			return true;
		}
		request.getRequestDispatcher("/index.jsp").forward(request, response);
		return false;
	}

}
