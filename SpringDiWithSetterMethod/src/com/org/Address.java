package com.org;

// Dependent Object Class Aggregation class
public class Address 
{
	private String addressLine;
	private String city;
	private String state;
	private String country;
	
	
	public String getAddressLine() {
		return addressLine;
	}
	public void setAddressLine(String addressLine) {
		this.addressLine = addressLine;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public String toString()
	{
		return  addressLine+" "+city+" " +state+" "+country;
		
	}
	
}
