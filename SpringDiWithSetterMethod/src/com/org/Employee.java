package com.org;

public class Employee 
{
	private int id;
	private String name;
	
	//Aggregation
	
	private Address address;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Dependent Object
	
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public void showData()
	{
		System.out.println("Employee Info[Id Name Address]: "+id +" "+name+" "+address);
		//System.out.println(address);
	}
	
}
