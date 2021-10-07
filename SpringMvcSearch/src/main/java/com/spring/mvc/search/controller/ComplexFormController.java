package com.spring.mvc.search.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ComplexFormController 

{
	@RequestMapping("/complex")
	public String showForm()
	{
		
		return "complexForm";
		
	}
	@RequestMapping(path="/handalForm", method = RequestMethod.POST)
	public String formhandler(@ModelAttribute("student") Student student,BindingResult result)
	{
		if(result.hasErrors())
		{
			return "complexForm";
		}
		
		System.out.println(student);
		System.out.println(student.getAddress());
		return "success";
		
	}

}
