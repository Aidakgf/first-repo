package day07stringmanipulations;

import java.util.Scanner;

public class StringManipulation02ReviewHomework {

	public static void main(String[] args) {
		

//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your full name...");
//		String fullName = scan.nextLine();
//		System.out.println(fullName);
//		
//		String trimmedFullName = fullName.trim();
//		System.out.println(trimmedFullName);
//		
		
		String str = "Ayhan BEYHAN";
		str = str.substring(0,5).toUpperCase();
		str = str.substring(6).toLowerCase();		
		System.out.println(str);
		
		
//		String s = "123-STart!!!";
//		System.out.println(s.replaceAll("\\A", "!!!"));
//		
		
//		String s = "   Tom Hanks  ";
//		String trimmedString = s.trim();
//		System.out.println(trimmedString);


	}

}
