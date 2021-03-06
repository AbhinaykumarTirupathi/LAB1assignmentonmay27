package com.Lab6;

public class TreesetAccount implements Comparable<TreesetAccount> {
		
		private int id ;
	  private String name ;
		private double balance;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		public TreesetAccount(int id, String name, double balance) {
		
			this.id = id;
			this.name = name;
			this.balance = balance;
		}
		public int compareTo(TreesetAccount b) {  
			return this.name.compareTo(b.name);
		}  

	}