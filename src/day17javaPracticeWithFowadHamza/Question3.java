package day17javaPracticeWithFowadHamza;


import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {

		// Find the factorial of a number
		// 10! = 10*9*8*7----1
		// 4!= 4X3x2X1

		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the number to calculate the factorial");
		int num = scan.nextInt();
		int fact = 1;
		// we need to start from 1 to the number
		for (int i = 1; i <= num; i++) {
			System.out.println("Value of i is" + i);
			fact = fact * i;
		}
		System.out.println("Factorial is " + fact);
	}

}
