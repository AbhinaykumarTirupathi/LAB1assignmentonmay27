package Lab3;

import java.util.Scanner;

public class Lab3Ex8 {
	

		    static boolean isAlphabaticOrder(String s) {
		        int n = s.length();
		 
		        for (int i = 1; i < n; i++) {
		 
		            // if element at index 'i' is less
		            // than the element at index 'i-1'
		            // then the string is not sorted
		            if (s.charAt(i) < s.charAt(i - 1)) {
		                return false;
		            }
		        }
		 
		        return true;
		    }
		 
		// Driver code
		    static public void main(String[] args) {
		    	Lab3Ex8 p = new Lab3Ex8();
		        Scanner s = new Scanner(System.in);
		        System.out.println("Enter a string");
		        String str = s.next();
		        if (isAlphabaticOrder(str)) {
		            System.out.println("Yes");
		        } else {
		            System.out.println("No");
		        }
		    }
		}
	
	

