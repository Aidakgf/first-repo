package day10loops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		/*
		 Get the number of rows from user then draw a right triangle by using asterixis
			Number of rows = 4 ==>   	*
                                   		* *
                                   		* * *
                                   		* * * *
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int rows = scan.nextInt();
		
		for(int i=1; i<=rows ; i++ ) {
			
			for(int j=1 ; j<=i; j++) {
				System.out.print( "* ");				
			}
		System.out.println();
		
		
		}
	}

}
