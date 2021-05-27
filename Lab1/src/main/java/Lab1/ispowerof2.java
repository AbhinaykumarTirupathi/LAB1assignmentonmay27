package Lab1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ispowerof2 {
	static boolean isPowerofTwo(int x)
    {
		
		 
		      /* First x in the below expression is
		        for the case when x is 0 */
		        return x!=0 && ((x&(x-1)) == 0);
		         
		    }

		     
		    // Driver method
		    public static void main(String[] args) throws IOException
		    {
		    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter N");
				String b=br.readLine();
				int N=Integer.parseInt(b);
		         System.out.println(isPowerofTwo(N) ? "Yes" : "No");
		         
		    }
}
