package com.org;

						//Constructer Injection with Dependant object

public class Address
{
	String city;
	String state;
	String country;
	
	Address(String city ,String state ,String country )
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	public String toString()
	{
		return city +" "+state+" "+country;
	}
}
