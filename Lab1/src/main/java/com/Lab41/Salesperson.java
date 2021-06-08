package com.Lab41;

public class Salesperson extends Manager{
	double commision;
	public Salesperson(double allowence, String name, double b_salary, String dept, int emp_Id,double commision) {
		super(allowence, name, b_salary, dept, emp_Id);
		this.commision=commision;
		System.out.println("Commision:"+commision);
	}
	
	public void showTotalSalary()
	{
		System.out.println("For Mgr:"+(b_salary+allowence+commision));
	}
	
	

}