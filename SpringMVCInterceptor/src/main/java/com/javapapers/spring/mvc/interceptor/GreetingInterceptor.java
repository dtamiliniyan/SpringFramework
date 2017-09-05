package com.javapapers.spring.mvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

@Component
public class GreetingInterceptor extends HandlerInterceptorAdapter {
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		System.out.println("GreetingInterceptor: REQUEST Intercepted for URI: "
				+ request.getRequestURI());
		request.setAttribute("greeting", "Happy Diwali!");
		return true;
	}
}
