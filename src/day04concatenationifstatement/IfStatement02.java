package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement02 {

	public static void main(String[] args) {
		
		// Ask user to enter a day, then print if it is "Weekday" or "Weekend day" on the console.
		/* 
		 The comparison operator "=="
		 1) primitives ----> compares values
		 2) non-primitive ----> compares values and references (addresses)
		 
		 to check if a String has the same value with another String use "equals()"
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a day");
		String day=scan.next().toLowerCase();
		if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || 
				day.equalsIgnoreCase("FridAy")) {
			System.out.println("Week day");
		} else if (day.equals("saturday") || day.equals("sunday")) {
				System.out.println("Weekend day");
		
		} else {
			System.out.println("Enter the day correctly");
		}
		
		
		
		// if(day.equals("Tuesday")) {
			//System.out.println("Week day");
			
		// if(day.equals("Wednesday")) {
			//System.out.println("Week day");
			
		//	OR WE CAN DO IT AS FOLLOWS
		
		//if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {
			//	System.out.println("Week day");
	//	}
		
	//	if(day.equals("Saturday") || day.equals("Sunday")) {
	//		System.out.println("Weekend day");
	//	}
		
		scan.close();
		
	}
}
	

/// ПРОБЛЕМА С КОДОМ ПРОВЕРИТЬ С ИДРИСОМ
		
//		public static void main(String[] args) {
//	        
//	        //Ask user to enter a day, then print if it is “Weekday” or “Weekend day” on the console.
//	        /*
//	         The comparison operator "=="
//	         1) primitives ----> compares values
//	         2) non-primitive -----> compare values and addresses
//	         
//	         to check if a String has the same value with another String, use "equals()" method
//	         */
//	        
//	        Scanner scan=new Scanner(System.in);
//	        System.out.println("Enter a day");
//	        String day=scan.next().toLowerCase();//monday
//	        
//	        if(day.equals("monday") || day.equals("tuesday") || day.equals("wednesday") || day.equals("thursday") || day.equals("friday")) {
//	            System.out.println("Week day");
//	        } else if (day.equals("saturday") || day.equals("sunday")) {
//	            System.out.println("Weekend day");
//	        } else {
//	            System.out.println("Enter the day correctly"); 
//	            
//	        }
//	        
//	    }