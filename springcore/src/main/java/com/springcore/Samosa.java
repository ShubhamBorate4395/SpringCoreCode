package com.springcore;

public class Samosa 
{
		private double price;

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			System.out.println("Inside Setter Injection!!");
			this.price = price;
		}

		@Override
		public String toString() {
			return "Samosa [price=" + price + "]";
		}
		
		public void init()
		{
			System.out.println("inside init method!!");
			
		}
		
		public void destroy()
		{
			System.out.println("inside destroy method!!");
			
		}
		
}
