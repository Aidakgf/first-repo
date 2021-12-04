package practice2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class UniqueElements {

	/*
	 * create a list by getting the list elements from user if there is duplicated
	 * elements remove them from the list ask user to stop if they are done with
	 * words as Enter list elements, to stop entrance press '*'
	 */

	public static void main(String[] args) {
			
		// [ibrahim, Osman, Ahmet, Osman, ibrahim]
				
				//[Osman, Ahmet, ibrahim]
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter list elements, to stop entrance press '*' ");
		
		String str = "";
		
		List<String> list = new ArrayList(); // is interface, we can't creat obj out of it
		
		
		//true
		while(!str.contains("*")) {
			
			str = scan.next();
			
			if(!str.equals("*")) {
				list.add(str); // ibrahim, osman, ali, *
			}
			
		}
		System.out.println(list);
		
		Set<String> uniqueElements = new HashSet<>(list);
		
		System.out.println(uniqueElements);


	}

}
