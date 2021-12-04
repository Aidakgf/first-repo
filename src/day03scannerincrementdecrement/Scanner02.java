package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner02 {

	public static void main(String[] args) {
		/*
		 Type a program which calculates the area and the perimeter of a rectangle whose 
		 length and width are entered by user.
		 Hint 1: Area of a rectangle is width*length.
		 Hint 2: Perimeter of a rectangle is 2*(width+length).
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		double length = scan.nextDouble();
		System.out.println("Enter the width of rectangle");
		double width = scan.nextDouble();		
				
		System.out.println("The area: " + length*width);
		System.out.println("The perimeter: " + 2*(width+length));
		
		scan.close();
	}

}
