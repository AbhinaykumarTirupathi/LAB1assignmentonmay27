package Lab1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CheckNumber {
	
	
	 boolean CheckNumber1(int N)
	    {
		 boolean increasing = true;

			while (N > 0) {
			    int d1 = N % 10;
			    N /= 10;
			    int d2 = N % 10;

			    if (d2 > d1) {
			        increasing = false;
			        break;      
	    }
			}
			return increasing;
	    }
	     
			    public static void main(String[] args) throws IOException 
			    {
			    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
					System.out.println("Enter N");
					String b=br.readLine();
					int N=Integer.parseInt(b);
					CheckNumber c= new CheckNumber();
					   System.out.println(c.CheckNumber1(N));		
					
					
			     
	}
			}

				