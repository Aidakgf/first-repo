package day16arraysforeachloop;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays04 {
	

	public static void main(String[] args) {
		
		// Type code to find the number of words in a String
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any String...");
		String s = scan.nextLine();
		
		
		// How to split a String by using any character
		String words[] = s.split(" ");
		System.out.println(Arrays.toString(words)); //[ALi, Can, went, to, school]
		System.out.println("The number of words: " + words.length); //The number of words: 5
		
		
		// Count how many words start with "a"
		int count = 0;
		
		for(int i=0; i<words.length; i++) {
			if(words[i].startsWith("a")) {
				count++;				
			}			
		}
		System.out.println(("The number of words start with a: " + count));
		
		scan.close();
		

	}

}
