package day10loops;

import java.util.Scanner;

public class WhileLoop06 {

	public static void main(String[] args) {
		/*
		 * Get String from user and print just vowels(aeiou) inside String on the
		 * console HOMETASK
		 */

		// Declare a variables
		

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a string");
		String str = scan.nextLine();

		// Convert String to lower case letter
		str = str.toLowerCase();

		// Print all vowels
		System.out.print("Vowels in the given String are:");

		// For loop to iterate String
		for (int i = 0; i < str.length(); i++) {

			// check a character is vowel or not
			if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
					|| str.charAt(i) == 'u') {

				// Display each vowel
				System.out.print(" " + str.charAt(i));
			}

		}
	}

}
