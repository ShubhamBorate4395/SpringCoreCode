package com.org;

public class Library
{
	
	private Book bookName;
	
	
	public Book getBookName() {
		return bookName;
	}

	public void setBookName(Book bookName) {
		this.bookName = bookName;
	}

	public Library() 
	{
		super();
	}

	public Library(Book bookName)
	{
		super();
		this.bookName = bookName;
		System.out.println("Inside constructer");
	}

	@Override
	public String toString() {
		return "Library [bookName=" + bookName + "]";
	}


	
	
}
