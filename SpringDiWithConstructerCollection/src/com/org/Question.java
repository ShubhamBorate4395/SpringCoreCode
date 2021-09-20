package com.org;

import java.util.Iterator;
import java.util.List;

public class Question 
{
	private int id;
	private String name;
	//private List<String> answer;
	//private List<Answer> answer;
	private List<Answer> answer;
	Question(int id, String name, List<Answer> answer )
	{
		this.id=id;
		this.name=name;
		this.answer=answer;
	}
	
	public void dispInfo()
	{
		System.out.println(id +" "+ name);
		System.out.println("Answer are:");
		
//		Iterator<String> itr =answer.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		
		Iterator<Answer> itr =answer.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
