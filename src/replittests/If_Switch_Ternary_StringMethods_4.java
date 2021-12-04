package replittests;

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods_4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter command");	
		String ch = scan.next();
		
		switch(ch) {
		case "a":
			System.out.println("Your request is being processed");
			break;
		case "b":
			System.out.println("Thank you anyway for your consideration");
			break;
		case "c":
			System.out.println("Sorry, no help is currently available");
			break;
		default:
			System.out.println("Invalid entry, please try again!");
			
		
		}
		
		
		
	}

}
