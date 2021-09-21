package com.springcore.standalone;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person 
{
	private List<String> friends;
	private Map<String,String> fees;
	private Properties property;
	
	

	public List<String> getFriends() {
		return friends;
	}

	public void setFriends(List<String> friends) {
		this.friends = friends;
	}

	public Map<String, String> getFees() {
		return fees;
	}

	public void setFees(Map<String, String> fees) {
		this.fees = fees;
	}

	public Properties getProperty() {
		return property;
	}

	public void setProperty(Properties property) {
		this.property = property;
	}

	@Override
	public String toString() {
		return "Person [friends=" + friends + ", fees=" + fees + " ]";
	}

	
	
	
	
}
