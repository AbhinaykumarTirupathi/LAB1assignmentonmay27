package com.Lab6;

import java.util.TreeSet;

public class TreeUserClass {
	


		public static void main(String[] args) {
			
			//TreesetAccount a=new TreesetAccount();
			TreeSet<TreesetAccount> a=new TreeSet<TreesetAccount>();
			TreesetAccount b1=new TreesetAccount(10,"Tony",100);
			TreesetAccount b2=new TreesetAccount(11,"Roxy",10000);
			TreesetAccount b3=new TreesetAccount(12,"Cruella",100000);
			a.add(b1);
			a.add(b2);
			a.add(b3);
			for(TreesetAccount i:a) {
				System.out.println(i.getId()+" "+i.getName()+" "+i.getBalance());
				System.out.println("");
			}

	}
	}
