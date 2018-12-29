package com.jsoft.ems.config;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class ClearChaceFIlter
 */
/**
 * @author Nasruddin khan 
 *
1:35:01 AM
 */
public class ClearChaceFIlter implements Filter {

    /**
     * Default constructor. 
     */
    public ClearChaceFIlter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		// place your code here
		System.out.println("ClearChaceFIlter.doFilter()");
		 HttpServletResponse httpServletResponse = (HttpServletResponse) response;
		 httpServletResponse.setHeader("Cache-Control", "no-cache, no-store, must-revalidate"); // HTTP 1.1.
		 httpServletResponse.setHeader("Pragma", "no-cache"); // HTTP 1.0.
		 httpServletResponse.setDateHeader("Expires", 0); 
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
