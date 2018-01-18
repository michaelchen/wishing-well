package org.cdx.ww.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class CharacterEncodingFilter implements Filter {

	public void destroy() {
		System.out.println("CharacterEncodingFilter destroy()");
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("CharacterEncodingFilter before doFilter()");
		chain.doFilter(request, response);
		System.out.println("CharacterEncodingFilter after doFilter()");
	}

	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("CharacterEncodingFilter init()");
	}

}
