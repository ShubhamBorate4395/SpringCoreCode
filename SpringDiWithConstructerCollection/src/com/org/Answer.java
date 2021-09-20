package com.org;

public class Answer 
{										//Constructor Injection with Non-String Collection
	private int id;
	private String name;
	private String by;
	
	Answer(int id, String name, String by)
	{
		this.id = id;
		this.name= name;
		this.by= by;
	}
	
	public String toString()
	{
		return id+"> "+name+"-> "+by;
	}
	
}
