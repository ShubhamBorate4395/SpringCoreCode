package com.spring.mvc.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController
{
	
	//Here we are using Model Class
	@RequestMapping("/home")
	public String home(Model model)
	{
		System.out.println("this is a home url!!");
		model.addAttribute("name", "Shubham Borate");
		model.addAttribute("id", 207);
		
		List<String> friends =new LinkedList<String>();
		friends.add("Rohan");
		friends.add("Gaurav");
		friends.add("Manisha");
		friends.add("Shubham");
		
		model.addAttribute("friendsList", friends); //here is list interface so we cant use ref variable in string format
		
		return "index";
		
	}
	
	@RequestMapping("/services")
	public String services()
	{
		System.out.println("this is a services url!!");
		return "services";
		
	}
	@RequestMapping("/about")
	public String about()
	{
		System.out.println("this is a about url!!");
		return "about";
		
	}
	
	//Here we are using ModelAndView Class
	@RequestMapping("/help")
	public ModelAndView help()
	{
		System.out.println("this is a help url!!");
		//Creating model and view object
		ModelAndView modelAndView = new ModelAndView();
		
		//setting the data
		modelAndView.addObject("name" , "MS DHONI");
		modelAndView.addObject("rollNo", 07);
		
		LocalDateTime dateTime = LocalDateTime.now();
		modelAndView.addObject("date", dateTime);
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(96);
		list.add(84);
		list.add(97);
		list.add(94);
		list.add(92);
		modelAndView.addObject("marks",list);
		
		//setting the view page
		modelAndView.setViewName("help");
		
		return modelAndView;
		
	}
}
