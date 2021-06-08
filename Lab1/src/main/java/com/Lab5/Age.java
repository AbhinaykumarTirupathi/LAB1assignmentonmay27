package com.Lab5;

public class Age {
	
	
	int  age;

	public Age(int age) {
		super();
		this.age = age;
	}
	

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
	if(age>15)
	{
		this.age = age;
		System.out.println("Age is vaild");
	}
	else {
		throw new AgeInvalidException();
		
	}
		
	}
	public static void main(String[] args)
	{
		Age  a=new Age(0);
		a.setAge(45);
	}
}