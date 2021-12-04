package day10loops;

import java.util.Scanner;

public class WhileLoop04 {

	public static void main(String[] args) {
		/*
		 		Type java code by using while loop,
				Write a program to count the factors of an integer which is entered by user.
				Factors of 12 = 1, 2, 3, 4, 6, 12 ==> 6
				Factors of 8 = 1, 2, 4, 8 ==> 4
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int num = scan.nextInt();
		
		int counter=0; //in order to count how many vectors
		
		int i = 1;
		while( i<=num) {
			
			if(num%i==0) {
				System.out.print(i + " ");
				counter++;				
			}
		i++;		
		}
		System.out.println("The number of positive factors: " + counter);
		System.out.println("The number of negative factors: " + counter);
		System.out.println("The number of all factors: " + 2*counter);
		
		scan.close();
	}
	
}
