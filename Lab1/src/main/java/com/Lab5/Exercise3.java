package com.Lab5;


import com.cg.eis.exception.EmployeeException;

public class Exercise3 {
	private int sal;

	public Exercise3(int sal) {
		super();
		this.sal = sal;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		if(sal>3000)
		{
		this.sal = sal;
		System.out.println("Salary is:"+sal);
	}
		else
		{
			throw new EmployeeException();
		}
	}
	public static void main(String[] args)
	{
		Exercise3 e=new Exercise3(0);
		e.setSal(500);
	}
	

}
