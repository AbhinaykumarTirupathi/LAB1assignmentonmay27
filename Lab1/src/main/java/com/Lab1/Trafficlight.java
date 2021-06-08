package com.Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Trafficlight {

	public static void main(String[] args) throws IOException 
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter 1 for Red");
		System.out.println("Enter 2 for Yellow");
		System.out.println("Enter 3 for Green");
		String b=br.readLine();
		int num=Integer.parseInt(b);
		
		switch(num) {
	        case 1 : 
	                    System.out.println("Stop");
	            break;
	        case 2: System.out.println("Ready");
	            break;
	        case 3 : System.out.println("Go");
	            break;
	      
	            default : System.out.println("wrong choice");
	        }

	}

}
