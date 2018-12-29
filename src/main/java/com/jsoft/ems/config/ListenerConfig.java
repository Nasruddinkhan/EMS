package com.jsoft.ems.config;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.web.WebApplicationInitializer;

/**
 * @author Nasruddin khan 
 *
1:34:51 AM
 */
public class ListenerConfig implements WebApplicationInitializer {

	@Override
	public void onStartup(ServletContext servletContext) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("ListenerConfig.onStartup()");


	}

}
