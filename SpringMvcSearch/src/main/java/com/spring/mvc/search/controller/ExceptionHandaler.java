package com.spring.mvc.search.controller;

import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;


/*exception handal centralized controller */

@ControllerAdvice
public class ExceptionHandaler 
{
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NullPointerException.class)
	public String exceptionhandalNull(Model m)
	{
		m.addAttribute("msg","Null pointer exception occured");
		return "errorshow";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=NumberFormatException.class)
	public String exceptionhandalNumber(Model m)
	{
		m.addAttribute("msg","Number pointer exception occured");
		return "errorshow";
	}
	
	@ResponseStatus(value=HttpStatus.INTERNAL_SERVER_ERROR)
	@ExceptionHandler(value=Exception.class)
	public String exceptionhandalgenric(Model m)
	{
		m.addAttribute("msg"," Genric pointer exception occured");
		return "errorshow";
	}
}
