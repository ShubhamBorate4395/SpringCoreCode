package com.org;

public class Address 
{
	private String city;
	private String state;
	private String country;
	
	public Address(String city,String state,String country)
	{
		this.city=city;
		this.state=state;
		this.country=country;
	}
	
	public String toString()
	{  
	    return city+" "+state+" "+country;  
	}  

}

/*public class Address 
{  
	private String addressLine1,city,state,country;  
	  
	public Address(String addressLine1, String city, String state, String country)
	{  
	    super();  
	    this.addressLine1 = addressLine1;  
	    this.city = city;  
	    this.state = state;  
	    this.country = country;  
	}  
	public String toString()
	{  
	    return addressLine1+" "+city+" "+state+" "+country;  
	}  
	  
}  */
