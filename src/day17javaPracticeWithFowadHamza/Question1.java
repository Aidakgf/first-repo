package day17javaPracticeWithFowadHamza;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
		// We want to input two numbers in the console and we should get the sum then the
		// console should want for the next two numbers to be inputted
		// if we give it then it should added...
		// but if we give a CHAR "Y" then it should continue the loop
		
		Scanner scan = new Scanner(System.in);
		int flag = 0;
		do{
		System.out.println("Please provide first number and press Enter: ");
		int number1 = scan.nextInt();
		System.out.println("Please provide second number and press Enter: ");
		int number2 = scan.nextInt();
		System.out.println("Sum of the number is " + (number1+number2));
				
		System.out.println("Do you want to continue? YES press 1 else press any other key");
		flag = scan.nextInt();
		}
		while(flag==1);
		

	}

}
