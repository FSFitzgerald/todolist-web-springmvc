package com.hcmus.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ToDoListInit extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		Class[] configClasses = {ToDoListAppConfig.class};
		return configClasses;
	}

	@Override
	protected String[] getServletMappings() {
		String[] servlets = {"/"};
		return servlets;
	}

}
