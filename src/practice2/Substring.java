package practice2;

import java.util.Scanner;

public class Substring {

	public static void main(String[] args) {
		
		/*
		 	1.Ask user to enter a word if the word has odd number of characters
		 	length() of characters and has 3 or more characters, print the character in the
		 	middle of the word.
		 */
		
		// Ali => true
		// 1 it has odd number of characters
		// it has even number of characters
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please type a name");
		
		String name = scan.next();
		
		if(name.length() % 2 == 1 && name.length() >=3) {
			System.out.println("The word has odd number of characters");
			System.out.println(name.substring(name.length()/2, name.length()/2+1));
		}else {
			System.out.println("Word has even number of characters");
		}
		

	}

}
