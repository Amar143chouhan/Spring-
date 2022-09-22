package com.ctrl;

import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.entities.Todo;

@Controller
public class HomCtrl {
	
	@Autowired
	ServletContext context;

	@RequestMapping("/home")
	public String home(Model m) {
		
	
		m.addAttribute("page","home");

		return "home";
	}
   
	@RequestMapping("/add")
	public String add(Model m) {
		
	Todo t =new Todo();
	
	m.addAttribute("page", "add");
	m.addAttribute("Todo",t);
		return "home";
		}
	
	@RequestMapping(value="/saveTodo",  method = RequestMethod.POST)
	public String saveTodo(@ModelAttribute("Todo") Todo t,Model  m) {
		
		
        List<Todo> list = (List<Todo>) context.getAttribute("list");	
		t.setTodoDate(new Date());
		System.out.println(t);
		list.add(t);
		m.addAttribute("msg","successfully ADDED...." );
		
		return "home";
		}
	
	}