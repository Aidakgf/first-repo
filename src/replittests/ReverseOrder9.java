package replittests;

import java.util.Scanner;

public class ReverseOrder9 {

	public static void main(String[] args) {
		
		// Write a java program to reverse the number which user entered.

		// Input :1238
		// Output :Reverse Of The Number: 8321
		
		Scanner scan = new Scanner(System.in);
		String num = scan.next();
		String reversed = "";

		for (int i = num.length() - 1; i >= 0; i--) {
			
			char c = num.charAt(i);
			
			reversed = reversed + c;

		}
		System.out.print("Reverse Of The Number: " + reversed);
		
		scan.close();

	}
	
	

}
