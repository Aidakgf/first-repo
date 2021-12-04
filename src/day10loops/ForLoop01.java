package day10loops;

import java.util.Scanner;

public class ForLoop01 {

	public static void main(String[] args) {
		/*
		 	Get the number of rows and columns from user.
			Create a rectangle.
			rows = 3 and column = 5 ==> * * * * *
		 								* * * * *
		 								* * * * *		 
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = scan.nextInt();
		System.out.println("Enter the number of columns");
		int columns = scan.nextInt();
		
		for(int i=1; i<=rows ; i++ ) {
			
			for(int j=1 ; j<=columns; j++) {
				System.out.print( "* ");				
			}
		System.out.println();	
		
		}
		
		
		

	}

}
