package replittests;

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods_6 {

	public static void main(String[] args) {
		
		Scanner  scan = new Scanner(System.in);
		//System.out.println("Enter a name with 3 letters only: ");
		String name = scan.next();
		
		String str = name.indexOf(name.charAt(0)) == name.lastIndexOf(name.charAt(0)) ? 
				(name.indexOf(name.charAt(1)) == name.lastIndexOf(name.charAt(1)) ?
						"unique" : "duplicate") : "duplicate";
		
		System.out.println("Your String has " + str + " characters" );
					
		
		
		
	}

}
