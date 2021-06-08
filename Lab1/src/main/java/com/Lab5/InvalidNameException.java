package com.Lab5;


public class InvalidNameException extends RuntimeException {

	public String toString()
	{
		return"com.Lab5.InvalidNameException:firstname and last name is not entered";
	}

}