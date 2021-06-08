package com.Lab41;



public class Employee {
	
	private String name;
	protected double b_salary;
	private String dept;
	private int Emp_Id;
	

	public Employee(String name, double b_salary, String dept, int emp_Id) {
		super();
		this.name = name;
		this.b_salary = b_salary;
		this.dept = dept;
		Emp_Id = emp_Id;
	}
	public void showTotalSalary()
	{
		System.out.println("For Emp:"+b_salary);
	}
	public void showIdName()
	{
		System.out.println("Emp_Id:"+Emp_Id+"name:"+name);
	}

}