
package com.Lab3;
import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;


public class Lab3Ex9 {
public static void main(String[] args) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter Date in dd/mm/yyyy");
	String dateIn = br.readLine();
	
	DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	LocalDate dateEntered = LocalDate.parse(dateIn,format);
	LocalDate today = LocalDate.now();
	
	System.out.println("System's date:" +today);
	System.out.println("Entered date: " +dateEntered);
	
	Period period = dateEntered.until(today);
	System.out.println("Durration"
			+"Days"+ period.getDays()
			+"Months" + period.getMonths()
			+ "Years" + period.getYears());
}
}
