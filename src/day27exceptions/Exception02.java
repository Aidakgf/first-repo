package day27exceptions;

import java.util.Scanner;

public class Exception02 {
	
	// Create a method to get student's age and print it on the console
	// IllegalArgumentException

	public static void main(String[] args) {		
		try {
		getPrintAge();	
		} catch (IllegalArgumentException e) {
			System.out.println("Age cannot be negative");
		}
	}
	
	public static void getPrintAge() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Write the age of student...");
		int age = scan.nextInt();		
		
		if(age >=0) {
			System.out.println(age);
		} else {
			throw new IllegalArgumentException();
		}
	}

	
}
