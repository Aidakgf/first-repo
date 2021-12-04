package day05nestedifternary;

import java.util.Scanner;

public class NestedIf01 {
	
	/*
	 Each character has an Index in the String
	 The index of the first character is 0
	 The index of the last character is "The number of characters -1"   
	 */

	public static void main(String[] args) {
		/*
		Ask user to enter a password
		
		If the initial of the password is uppercase then check if it is ‘A’ or not.
		If it is ‘A’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; Ali ==> Valid password     -   Mark ==> Invalid
		
		If the initial of the password is lowercase then check if it is ‘z’ or not.
		If it is ‘z’ the output will be “Valid Password”
		otherwise the output will be “Invalid Password”
		For example; zoo ==> Valid password     -   john ==> Invalid
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your password");
		String pass=scan.next();
		char init=pass.charAt(0);
		
		if(init>='A' && init<='Z') {
			if(init=='A') {
				System.out.println("It is valid password");
			} else {
				System.out.println("It is not valid password");
			}
			
		} else if (init>='a' && init<='z') {
			
			if (init=='z') {
				System.out.println("It is valid password");
			} else {
				System.out.println("It is not valid password");
			}
			
		} else {
			System.out.println("Initial must be letter in a valid password");
		}

		
		scan.close();
		
		
	
	}

}
