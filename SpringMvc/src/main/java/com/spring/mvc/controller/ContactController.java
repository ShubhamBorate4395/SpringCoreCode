package com.spring.mvc.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.model.User;
import com.spring.mvc.service.UserService;

@Controller
public class ContactController 
{
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commonData(Model model)
	{
		model.addAttribute("Header", "Learn Spring Technology ");  //for common data displaying when we use @ModelAttribute at above autoomatically call before below method
		model.addAttribute("desc", "spring [core orm mvc] ");
		System.out.println("common data displaying!!");
	}
	
	@RequestMapping("/contact")
	public String showForm(Model model)
	{
		System.out.println("creating Form!!");
		return "contact";
		
	}
	
	/*@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handlerForm(HttpServletRequest request)
	{
		String email=request.getParameter("email");			//using servlet we can getting value from views jsp page
		System.out.println("user email is: "+email);
		return "";
		
	}*/
	
	/*@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handlerForm												//this is the 1st way of fetching data from views to controller @RequestParam("")
	(
			//taking input from views contact.jsp page one by one
			
			@RequestParam( name= "email" ,required = false) String userEmail,      
			@RequestParam("userName") String userName,
			@RequestParam("userPassword") String userPassword,
			Model model
	)
		{
			//Printing output of contact.jsp page or send data from view to controller
		
			System.out.println("User Email is: "+userEmail);
			System.out.println("User Name is: "+userName);
			System.out.println("User Password is: "+userPassword);
			
			// to send data from controller to view
			model.addAttribute("email", userEmail);
			model.addAttribute("name", userName);
			model.addAttribute("password", userPassword);
			
			return "success";
		
		}*/
	
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handlerForm
	(
			//taking input from views contact.jsp page one by one
			@ModelAttribute User user , Model model		//this is syntax for @ModelAttribute annotation this annotation fetch the data from views and create the object of pojo class and stored data into ref of pojo class
	)
		{
		
			/*User user  = new User();
			user.setEmail(userEmail); 			//when @ModelAttribute annotation is used that time no required this code bcz its automatically happen process
			user.setUserName(userName);
			user.setUserPassword(userPassword);*/
			
			//Printing output of contact.jsp page or send data from view to controller
			System.out.println("Displaying data!!");
			System.out.println("User Details: "+user);
			
			if(user.getUserName().isEmpty())
			{
				return "redirect:/contact";
			}
			
			// to send data from controller to view
			/*model.addAttribute("user", user);*/ //this code also not required for @ModelAttribute annotation bcz its automatically happen process
			int createdUser = this.userService.createUser(user);
			model.addAttribute("msg","User Created with id is "+createdUser);
			return "success";
		
		}
}
