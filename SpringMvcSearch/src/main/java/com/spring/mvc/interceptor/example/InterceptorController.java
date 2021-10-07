package com.spring.mvc.interceptor.example;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class InterceptorController
{
	@RequestMapping("/intercept")
	public String home()
	{
		System.out.println("intercept home");
		return "interceptorHome";
		
	}
	
	
	//handling for request
	@RequestMapping("/welcome")
	public String welcome(@RequestParam("user") String name , Model m)
	{
		System.out.println(" Handler Start-> Name "+name);
		m.addAttribute("name",name);
		return "welcome";
	}
}
