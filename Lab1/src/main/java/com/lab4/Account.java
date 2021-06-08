package com.lab4;




public class Account {

	private int accNum;
	protected double balance;
	private String accHolder;
	protected double deposit;
	
	
	public Account(int accNum, double balance, String accHolder,double deposit) {
		
		this.accNum = accNum;
		this.balance = balance;
		this.accHolder = accHolder;
		this.deposit=deposit;
	}
	

	public  void deposit()
	{
	
	 System.out.println("Total amout:"+balance);
		

	}
	public  void withdraw()
	{
	
	 System.out.println("Total amout:"+balance);
		

	}


}
