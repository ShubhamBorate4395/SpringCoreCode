package com.org;

public class Employee
{
	private int id;
	private String name;
	private Address address;
	
	Employee(int id,String name,Address address)
	{
		this.id=id;
		this.name=name;
		this.address=address;
	}
	
	public void dispInfo()
	{
		System.out.println("Employee Id is "+id+" and Name is "+name);
		System.out.println("Employee Address is "+address);
		
	}
	 
		/*private int id;  
		private String name;  
		private Address address;  
		
		//public Employee() {}  
		  
		public Employee(int id, String name) {  
		    super();  
		    this.id = id;  
		    this.name = name;  
		}  
		public Employee(int id, String name, Address address) {  
		    super();  
		    this.id = id;  
		    this.name = name;  
		    this.address = address;  
		}  
		  
		void show(){  
		    System.out.println(id+" "+name);  
		    System.out.println(address);  
		}  */
		  
}  
		 
		  
		

