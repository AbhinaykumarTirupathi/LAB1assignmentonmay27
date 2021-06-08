package com.Lab41;

public class CurrentAccount extends SavingAccount {

	
	public CurrentAccount(int accNum, double balance, String accHolder,double deposit,double withdraw) {
		super(accNum, balance, accHolder,deposit);
		this.withdraw=withdraw;
		
	}
	public  void deposit()
	{
	
	 System.out.println("Total amout:"+balance);
		

	}


	public void withdraw()
	{
		System.out.println("Withdraw  amout:"+withdraw);
		System.out.println("Total amount:"+(balance-withdraw));
	}

}