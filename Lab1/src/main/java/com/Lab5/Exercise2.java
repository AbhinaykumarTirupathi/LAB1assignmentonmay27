package com.Lab5;

public class Exercise2 {
	private String firstName;
	private   String lastName;
	public Exercise2(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String firstName, String lastName) {
		if(firstName.equals(" ")&&lastName.equals(" "))
		{
			throw new InvalidNameException();
		}
		else {
			
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
	}
	public static void main(String[] args) {
		Exercise2 e=new Exercise2(null, null);
		e.setLastName("v","S");
	}

}
