package com.sol.app;

//import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;

import javax.servlet.ServletContextListener;

public class ServletContextTest implements ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		ServletContext sc = sce.getServletContext();
		//Enumeration e = sc.getInitParameterNames();
		//String test = (String) sc.getInitParameter("contextTest");

    	Scheduler scheduler = new Scheduler();
    	//scheduler.execute(() -> System.out.println("Hello World"), 9, 49, 0);
    	scheduler.execute(0, 0, 0);
	}

	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("contextDestroyed");
	}
}
