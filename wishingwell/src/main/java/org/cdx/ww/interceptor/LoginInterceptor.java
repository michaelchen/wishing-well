package org.cdx.ww.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {

	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception exc)
			throws Exception {
	}

	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	}

	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// Get request URL
		String url = request.getRequestURI();
		// Intercept all URLs except login
		if (url.endsWith("/login") || url.endsWith("/register") || url.endsWith("/doRegister")) {
			return true;
		}
		// Get Session
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");

		if (username != null) {
			return true;
		}
		// Forward to login page
		request.getRequestDispatcher("/login").forward(request, response);

		return false;
	}

}
