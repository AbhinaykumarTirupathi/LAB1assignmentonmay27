package Lab1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class diffSumofsqSumofn {

	static int CalculateDiff(int n){
		 
		int l, k, m;
		    // Sum of the squares of the
		    // first n natural numbers is
		    l = (n * (n + 1) * (2 * n + 1)) / 6;
		     
		    // Sum of n naturals numbers
		    k = (n * (n + 1)) / 2;
		 
		    // Square of k
		    k = k * k;
		     
		    // Differences between l and k
		    m = Math.abs(l - k);
		     
		    return m;
		 
		}
		 
		// Driver Code
		public static void main(String s[]) throws IOException
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter N");
			String b=br.readLine();
			int n=Integer.parseInt(b);
		    System.out.println(CalculateDiff(n));    
		     
		}
		}