package day03scannerincrementdecrement;

import java.util.Scanner;

public class Scanner01 {

	public static void main(String[] args) {
		/*
		Type a program which calculates the area and the perimeter of a square whose side length is entered by user.
		Hint 1: Area of a square is length*length.
		Hint 2: Perimeter of a square is 4*length.
		*/
		
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter the side length of square...");
		double sideLength = scan.nextDouble();
		
		System.out.println("The perimeter: " + 4*sideLength);
		System.out.println("The area: " + sideLength*sideLength);

		scan.close();
		//to close previous work//
		
	}

}
