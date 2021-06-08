package com.Lab41;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp=new Employee[3];
		emp[0]=new Employee("Shiva",100,"Analyst",21000);
		emp[1]=new Manager(1500,"Shiva",100,"Analyst",21000);
		emp[2]=new Salesperson(1500,"Shiva",100,"Analyst",21000,1000);
		
		for(Employee e:emp) {
			e.showIdName();
			e.showTotalSalary();
		}
		
	}

}
