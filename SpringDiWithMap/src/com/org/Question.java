package com.org;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question 
{
	private int id;
	private String name;
	//private Map<String, String>answers;
	private Map<Answer, User>answers;
	
	Question(int id, String name, Map<Answer,User>answers )
	{
		this.id=id;
		this.name=name;
		this.answers=answers;
	}
	
	public void dispInfo()
	{
		System.out.println("Qid is:"+id);
		System.out.println("Qname is:"+name);
		System.out.println("Answers Are:");
		
	//	Set<Entry<String ,String>>set =answers.entrySet();
		Set<Entry<Answer ,User>>set =answers.entrySet();
	//	Iterator<Entry<String, String>>itr =set.iterator();
		Iterator<Entry<Answer,User>>itr =set.iterator();
		while(itr.hasNext())
		{
			//Entry<String, String> entry =itr.next();
			Entry<Answer, User> entry =itr.next();
			System.out.println("Answer::"+entry.getKey()+"  Posted By::"+entry.getValue());
		}
		
		
	}
}
