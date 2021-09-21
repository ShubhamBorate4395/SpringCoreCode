package com.springcore.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component()
/*@Component("sp")*/ //changing name of the Class ref name use it as a bean name
public class SpringExpression 
{
	@Value("#{5}")
	private int spel;
	
	@Value("#{22+33}")
	private int a;
	
	@Value(" #{ T(java.lang.Math).sqrt(144) }")
	private double y;
	
	
	@Value(" #{ T(java.lang.Math).PI }")
	private double e;
	
	@Value(" #{ new java.lang.String('Rohit Sharma') }")
	private String name;
	
	@Value("#{ 8>3 }")
	private boolean isActive;
	
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public int getSpel() {
		return spel;
	}
	public void setSpel(int spel) {
		this.spel = spel;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "SpringExpression [spel=" + spel + ", a=" + a + ", y=" + y + ", e=" + e + ", name=" + name
				+ ", isActive=" + isActive + "]";
	}
	
	
	
}
