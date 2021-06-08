package com.lab4;


public class SavingsAccount extends Account {
	
	
	protected double withdraw;

	

	public SavingsAccount(int accNum, double balance, String accHolder,double deposit) {
		super(accNum, balance, accHolder,deposit);
		
		this.withdraw=withdraw;
	}
	

	public void deposit()
	{
		System.out.println("Deposit amout:"+deposit);
		System.out.println("Total amount:"+(balance+deposit));
	}
		public  void withdraw()
		{
		
		 System.out.println("Total amout:"+balance);
			

		
	}

}
