package day33maps;

import java.util.Arrays;
import java.util.HashMap;

/*
 			How to count the number of occurences of the words in a sentence
		    For example; “Java is easy. Type codes to learn Java. To earn money learn Java.”
		                  Java=3, is=1, easy=1, Type=1, ... , learn=2, ...

 */

public class HashMap01 {

	public static void main(String[] args) {
		
		String str = "Java is easy. Type codes to learn Java. To earn money learn Java.";
		System.out.println(str);
		
		// According to Java "Java" and "Java." are different words but in our task they should be same
		// because of that I need to remove all punctuation marks
		
		// str = str.replace(".", ""); // not flexible, better use replaceAll() - see below
		
		// "to" and "To" are different to Java but in my task they should be same
		str = str.replaceAll("\\p{Punct}", "").toLowerCase();
		System.out.println(str);
		
		String words[] = str.split(" ");
		System.out.println(Arrays.toString(words));
		
		HashMap<String, Integer> result = new HashMap<>(); // At the end, {java=3, is=1, easy=1, type=1, ... money=1} ==> result map
		
		for(String w : words) { //[java, is, easy, type, codes, to, learn, java, to, earn, money, learn, java]
			
			Integer numOfOccurence = result.get(w); // get() is for getting value by using key
			
			// If the word does not exist in the map "if-body" will be executed
			if(numOfOccurence==null) {
				
				result.put(w, 1);
			
			// If the word exists in the map "else-body" will be executed
			}else {
				
				result.put(w, numOfOccurence + 1);
				
			}			
			
		}
		System.out.println(result);
		
		
		

	}

}
