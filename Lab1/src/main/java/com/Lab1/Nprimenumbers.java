package com.Lab1;
import java.io.*; 
import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Nprimenumbers {
	
	
		public static void main(String[] args) throws IOException 
		{
			
			int p;
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter n");
			String b=br.readLine();
			int n=Integer.parseInt(b);
		
			for(int i=2;i<n;i++)
			{
				p=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					p=1;
				}
				if(p==0)
					System.out.print(i+" ");
			}
		}
}
		