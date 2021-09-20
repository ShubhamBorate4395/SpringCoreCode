package com.org;

import java.util.Date;

public class Answer 
{
	private int id;
	private String answer;
	private Date postedDate;
	
	Answer(int id,String answer,Date postedDate )
	{
		this.id=id;
		this.answer=answer;
		this.postedDate=postedDate;
	}
	
	public String toString()
	{
		return "Id: "+id+" Answer:"+answer+" PostedDate: "+postedDate;
		
	}
}
