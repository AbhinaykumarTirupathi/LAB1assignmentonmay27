package Lab3;
import java.util.Scanner;
public class Lab3Ex2 {
	      
	       public String getImage(String str)
	       {
	              StringBuffer sbr = new StringBuffer(str);
	              sbr.append('|');
	              StringBuffer sb = new StringBuffer(str);
	              sb.reverse();
	              sbr.append(sb);
	              return sbr.toString();
	       }
	       public static void main(String[] ar)
	       {
	    	   Lab3Ex2 p = new Lab3Ex2();
	              Scanner s = new Scanner(System.in);
	              System.out.println("Enter a String");
	              String str = s.next();
	              System.out.println(p.getImage(str));
	       }
	}
