package day05nestedifternary;

import java.util.Scanner;

public class IfElse01 {

	public static void main(String[] args) {
		/*
	    Type java code by using if-else if() statement.
		Write a program to check if a year is leap year or not.
		A leap year must be positive number.
		If the year is divisible by 100 then it must be divisible by 400. ==> 1600 is leap, but 1700 is not
		If a year is not divisible by 100 then it must be divisible by 4. ==> 2004 is leap year, but 2007 is not
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a year");
		int year=scan.nextInt();
		
		if(year<=0) {
			System.out.println("Leap year must be positive");	
		} else if(year%100==0 && year%400==0) {
			System.out.println("It is a leap year");
		} else if(year%100!=0 && year%4==0) {
			System.out.println("It is a leap year");
		} else {
			System.out.println("It is not a leap year");
		}

		scan.close();
		
		
	}

}
