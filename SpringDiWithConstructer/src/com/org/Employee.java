package com.org;

public class Employee 
{
	private int empId;
	private String empName;
	private String companyName;
	private Address address;     //Aggregation Class we use here 
	
	Employee(int empId ,String empName, String companyName , Address address ) //Constructer
	
	{
		this.empId=empId;
		this.empName=empName;
		this.companyName=companyName;
		this.address=address;
	}
	
	public void dispEmpData()
	{
		System.out.println("Employee id is " + empId +" name is " + empName + " and his company name is " +companyName);
		System.out.println("Address is "+address.toString()); //for displaying content of Address Class
	}
	
}
