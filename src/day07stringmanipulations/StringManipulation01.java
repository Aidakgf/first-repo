package day07stringmanipulations;

public class StringManipulation01 {
	
	/*
	    Regex (Regular Expression): is used to declare a group of characters
	    1) All lower case letters ==> [a-z]
	    2) All upper case letters ==> [A-Z]
	    3) All upper case and lower case letters ==> [a-zA-Z]
	    4) All characters different from space character ==> \\S
	    5) Space character ==> \\s
	    6) All characters different from digits ==> \\D
	    7) All digits ==> \\d
	    8) Non alphabetical characters ==> [^a-zA-Z]
	    9) Characters from a to z, from A to Z, from 0 to 9, and _ ==> "\\w"
	    10) Characters different from a to z, from A to Z, from 0 to 9, and _ ==> "\\W"
	 */

	public static void main(String[] args) {
		
		// 1) Type code to find the number of space character in a String
				
//		 String s1 = "Ali went to the school";
//		 
//		 String updateds1 = s1.replaceAll("[a-z]", "");
//		 System.out.println(updateds1);
		
		
		
//		 String s1 = "Ali went to the school";
//		 
//		 String updateds1 = s1.replaceAll("[a-z]", "").replaceAll([A-Z], "");
//		 System.out.println(updateds1);
		
		
		 
//		 String s1 = "Ali went to the school.";
//		 
//		 String updateds1 = s1.replaceAll("[a-zA-Z]", "");
//		 System.out.println(updateds1);
		 
		 
		 
//		 String s1 = "Ali went to the school.";
//		 
//		 String updateds1 = s1.replaceAll("\\S", "");
//		 System.out.println(updateds1);
//		 
		 
		 
//		 String s1 = "Ali went to the school.";
//		 
//		 String updateds1 = s1.replaceAll("\\S", "");
//		 System.out.println(updateds1.length());
	
	
		 // 2)Type code to find the number of characters different from space character
		 
		 
//		 String s1 = "Ali1 went2 to3 the school.";
//		 String updateds1 = s1.replaceAll("\\S", "");
//		 
//		 // 1st way: Number of all characters - Number of space characters = Number of characters different from space character
//		 int numCharsDiffFromSpace = s1.length() - updateds1.length();
//		 System.out.println(numCharsDiffFromSpace);
//		 
//		 // 2nd way: Find the characters different from space directly
//		 
//		 String updated2s1 = s1.replaceAll("\\s", ""); //Ali1went2to3theschool without spaces
//		 System.out.println(updated2s1.length());      //REPEAT THROUGH VIDEO - done
//		 
		 
		 
		 // 3) Type code to  find the number of digits, number of letters, and characters different from digits and numbers.
		 
//		 String s2 = "Ali Can 1234567890 !!! ? .";
//		 
//		 String updateds2 = s2.replaceAll("\\D", ""); // "\\D" and "[^0-9]" have the same meaning
//		 System.out.println(updateds2.length()); //10
//		 
//		 String updated2s2 = s2.replaceAll("[^a-zA-z]", ""); //AliCan
//		 System.out.println(updated2s2.length());
//		 
//		 
//		 String updated3s2 = s2.replaceAll("[a-zA-Z0-9]", "");
//		 System.out.println(updated3s2.length());
		 
// найти ошибку в коде по уроку - done
		
		/* 	4) Check the password according to the given rule
			a)No space character at the beginning and at the end
	    	b)It must contain at least 1 digit
	    	c)It must contain at least 1 lowercase letter
			d)It must contain at least 1 uppercase letter
			e)It must contain at least 1 character different from digits and letters
 		*/
		 String pwd = " ! ";
		 boolean isFirstCharSpace = pwd.startsWith(" ");
		 System.out.println(isFirstCharSpace); //true
		 
		 boolean isLastCharSpace = pwd.endsWith(" ");
		 System.out.println(isLastCharSpace); //false
	 
		 int numOfDigitChars = pwd.replaceAll("\\D", "").length();
		 
		 int numOfLowerCaseChars = pwd.replaceAll("[^a-z]", "").length();
		 
		 int numOfUpperCaseChars = pwd.replaceAll("[^A-Z]", "").length();
		 
		 int numOfCharsDiffFromLetterAndDigit = pwd.replaceAll("[a-zA-Z0-9]", "").length();
		 
		 
		 if(isFirstCharSpace) {
			 System.out.println("Your password is invalid. Do not use space at the beginning.");
		 }
		 if(isLastCharSpace) {
			 System.out.println("Your password is invalid. Do not use space at the end.");
		 }
		 if(numOfDigitChars==0) {
			 System.out.println("Your password is invalid. Use at least 1 digit");
		 }
		 if(numOfLowerCaseChars==0) {
			 System.out.println("Your password is invalid. Use at least 1 lowercase letter");
		 }
		 if(numOfUpperCaseChars==0) {
			 System.out.println("Your password is invalid. Use at least 1 upper letter");
		 }
		 if(numOfCharsDiffFromLetterAndDigit==0) {
			 System.out.println("Your password is invalid. Use at least 1 character different fron letters and digits");
		 }
	}
}
