package com.Lab41;

public class MainAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account[] ac=new Account[3];
		ac[0]=new Account(2019521,4412.16,"Shiva", 2000);
		ac[1]=new SavingAccount(2019521,4412.16,"Shiva",2000 );
		ac[2]=new CurrentAccount(2019521,4412.16,"Shiva",2000, 2000);


		for(Account a:ac)
		{
			a.deposit();
	        a.withdraw();		
		}
	}
}