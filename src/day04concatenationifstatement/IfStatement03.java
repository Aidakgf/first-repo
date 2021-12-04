package day04concatenationifstatement;

import java.util.Scanner;

public class IfStatement03 {

	public static void main(String[] args) {
		// Type a code to print its season after getting a month from user
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a month");
		String month=scan.next();
		
		if (month.equals("March") || month.equals("May")) {
			System.out.println("It is in Spring");
		}
				
		scan.close();

	}

}

/*
 public static void main(String[] args) {
        //Type a code to print its season after getting a month from user
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a month");
        String month= scan.next().toLowerCase();
        
        if(month.equals("march") || month.equals("april") || month.equals("may") ) {
            System.out.println("It is in Spring");
        } else if (month.equals("june") ||month.equals("july") || month.equals("august")   ) {
            System.out.println("It is in Summer");
        } else if (month.equals("september") ||month.equals("october") || month.equals("november")   ) {
            System.out.println("It is in Fall");
        } else if (month.equals("december") ||month.equals("january") || month.equals("february")   ) {
            System.out.println("It is in Winter");
        } else {
            System.out.println("Type the month correctly");
        }
        
    }





 
*/
