package com.org;

public class Restaruant 
{
	private String welcomeNote;
	
	public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void dispNote()
	{
		System.out.println(welcomeNote);
	}
}
