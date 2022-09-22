package com.listen;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.entities.Todo;

public class MyListner implements ServletContextListener
{

	
	public void contextInitialized(ServletContextEvent sce) {
		// TODO Auto-generated method stub
	System.out.println("context created");
	
	List<Todo> list =new ArrayList<Todo>();
	
	ServletContext context = sce.getServletContext();
	context.setAttribute("list",list);
	
	
	
	
	}

	
	
	public void contextDestroyed(ServletContextEvent sce) {
		// TODO Auto-generated method stub
			}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
