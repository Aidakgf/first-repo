package day06nestedternaryswitchstringmanipulation;

import java.util.Scanner;

public class StringManipulation01 {

	public static void main(String[] args) {
		
		// Scanner scan = new Scanner(System.in);
		//System.out.println("Enter a string...");
		//String str = scan.nextLine();
		
		/*
		 	Print the first and last character of the given String on the console. 
		 	"Java is easy" ==> Jy
		 */
		//char firstChar = str.charAt(0);
		
		// char lastChar = str.charAt(11);
		
		// System.out.println(firstChar + lastChar); //195, because there is mathematical operation
		
		// System.out.println("" + firstChar + lastChar); //Jy for Java is really easy , because l is under 11 index
		
		// Last index will be 1 less that the number of characters
		
		// How can we find number of characters in a String? - str.lenth(); ==> returns the number of characters.
		
		//char lastChar = str.charAt(str.length()-1);
		// System.out.println("" + firstChar + lastChar);
		
		// if (str.length()==1) {
		//	System.out.println(firstChar);
		// }else {
		// 	System.out.println("" + firstChar + lastChar);
		// }
		
		//Print the index of first occurrence of 'a' if 'a' exists. Otherwise print no 'a'.
		/*
		 int idx = str.indexOf("boat"); //Mac==>Command + Hover over   Windows ==> Ctrl + Hover over
		 
		
		if(idx ==-1) {
			System.out.println("No 'a'");
		}else {
			System.out.println(idx + " is the index");
		}
		
		System.out.println(idx + " is the index");
		
		*/
		
		//Note 1: if you use non-existing character in IndexOf() method you will get -1 every time.
		//Note 2: IndexOf() method works with char and works with String
		//Note 3: If you use multiple characters in indexOf() method  it returns the index of first character
		//Note 4: indexOf() method works with  first occurrences every time.
		

		//Print index of last occurrence of a specific character
		//int lastIdx = str.lastIndexOf("ar");
		//System.out.println(lastIdx);
		
		//Note 1: if you use non-existing character in lastIndexOf() method you will get -1 every time.
		//Note 2: lastIndexOf() method works with char and works with String
		//Note 3: If you use multiple characters in lastIndexOf() method  it returns the index of first character
		//Note 4: lastIndexOf() method works with  first occurrences every time.
		
	
		//Check if a given character is unique in a String or not?
		//char c = 'a';
		
		//int firstOccurrenceIdx = str.indexOf(c);
		
		//int lastOccurrenceIndex = str.lastIndexOf(c);
		
		//if(firstOccurrenceIdx==-1) {
		//	System.out.println(c + " does not exist inside the String");
			
		//}else if(firstOccurrenceIdx==lastOccurrenceIndex) {
		//	System.out.println(c + " is unique");
		//}else {
		//	System.out.println(c + " is not unique");
		//}
		 
		//Get the initials of first name and last name of the user. Ali Can ==>AC
		//char initialOfFirstname = str.charAt(0);
		//char initialOfLastname = str.charAt(str.indexOf(" ")+1);
		//System.out.println("" + initialOfFirstname + initialOfLastname);
		
		//Get the character from index 3 to index 7 from a String
		//String sub = str.substring(3, 8); //in substring() method first index is inclusive, second index is exclusive
		//System.out.println(sub); // a is 
		
		//Get the character from index 3 to the end from a String
		//String sub2 = str.substring(3, str.length()); //in substring() method first index is inclusive, second index is exclusive
		//System.out.println(sub2); // AliCanan ==> Canan
		
		
		//Note: There are 2 substring() method. 
		//		First one has 2 parameters, it is used to get a parts of a String
		//		from starting index (inclusive) to the ending index(inclusive)
		
		//		Second one has a single parameter, it is used to get a part of a String
		//		from starting index(inclusive) to the end.
		
		
		/*
		 		String shirtPrice = $12.99
		 		String trouserPrice = $25.99
		 		Type code to calculate the sum of the shirt and the trouser prices.
		 */
		
		String shirtPrice = "$12.99";
		String trouserPrice = "$25.99";
		
		String updateShirtdPrice = shirtPrice.replace("$", "").replace(".", "");
		System.out.println(updateShirtdPrice);
		
		String updatedTrouserPrice = trouserPrice.replace("$", "").replace(".", "");
		System.out.println(updatedTrouserPrice);
		
		System.out.println((Integer.valueOf(updateShirtdPrice) + Integer.valueOf(updatedTrouserPrice))/100.00); 	//38.98
		
	
	}
		
}
