package com.spring.mvc.interceptor.example;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MyInterceptor  extends HandlerInterceptorAdapter
{

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("This is a afterCompletion handler!!");
		
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		System.out.println("This is a postHandler handler!!");
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		System.out.println("This is a preHandler handler!!");
		
		String name=request.getParameter("user");
		if(name.startsWith("A"))
		{
			response.setContentType("text/html");
			response.getWriter().print("<h2>Invalid Name, The Name Starts with charactor A is not valid!!</h2>");
			return false;
		}
		return true;
		
	}
	
	
}
