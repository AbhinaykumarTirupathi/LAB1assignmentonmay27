package com.Lab41;

public class Manager extends Employee {
	protected double allowence;

	public Manager(double allowence,String name, double b_salary, String dept, int emp_Id) {
		super( name, b_salary, dept,  emp_Id);
		this.allowence = allowence;
		
	
       System.out.println("allowence:"+allowence);
	}
	public void showTotalSalary()
	{
		System.out.println("For Mgr:"+(b_salary+allowence));
	}
}