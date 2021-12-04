package day17javaPracticeWithFowadHamza;

import java.util.Scanner;

public class Question7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int cPositive = 0;
		int cNegative = 0;
		int cZero = 0;
		char condition = 'n';
		do {
			System.out.println("Please provide your number ");
			int number = scan.nextInt();
			// count +,0 and -
			if (number > 0) {
				cPositive++;
			} else {
				if (number < 0) {
					cNegative++;
				} else {
					cZero++;
				}
			}
			System.out.println("Do u want to add more values?");
			System.out.println("Enter y to continue and any other key to exit");
			condition = scan.next().charAt(0);
		} while (condition == 'y');

		System.out.println("Positve " + cPositive);
		System.out.println("Negative " + cNegative);
		System.out.println("Zero " + cZero);

		// Write a program to enter the numbers till the user wants and at the end it
		// should display the
		// count of positive, negative and zeros entered.
	}

}
