package com.lab4;

public class Test {

	public static void main(String[] args) {
	
				
				Account[] ac=new Account[3];
				ac[0]=new Account(2019521,4412.16,"Tony", 2000);
				ac[1]=new SavingsAccount(2019521,4412.16,"Tony",2000 );
				ac[2]=new CurrentAccount(2019521,4412.16,"Stella",2000, 2000);


				for(Account a:ac)
				{
					a.deposit();
			        a.withdraw();		
				}
			}
		}

	
