package Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sumofndivby35 {
	 static int Calculatesum(int N, int X, int Y)
	    {
	        int S1, S2, S3;
	     
	        S1 = ((N / X)) * (2 * X + (N / X - 1) * X) / 2;
	        S2 = ((N / Y)) * (2 * Y + (N / Y - 1) * Y) / 2;
	        S3 = ((N / (X * Y))) * (2 * (X * Y)
	                          + (N / (X * Y) - 1) * (X * Y))/ 2;
	     
	        return S1 + S2 - S3;
	    }
	     
	    
	    public static void main(String[] args) throws IOException 
	    {
	    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter N");
			String b=br.readLine();
			int N=Integer.parseInt(b);
			
	     
	        System.out.println(Calculatesum(N, 3, 5));
	     
	    }
	    
	}