package day19arraylists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList03 {

	public static void main(String[] args) {
		/* 	A list has elements “M”, “K” and “P”
			Ask user to enter a letter
			If the letter exists in list convert it to "Got it"
			otherwise add the element which user entered into the list
		*/
		
		List<String> list1 = new ArrayList<>();
		list1.add("M");
		list1.add("K");
		list1.add("P");
		System.out.println(list1); //[M, K, P]
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter  a letter");
		String letter = scan.next().toUpperCase();
		
		if(list1.contains(letter)) {
			list1.set(list1.indexOf(letter), "Got it");
		}else {
			list1.add(letter);
		}
		System.out.println(list1);
		scan.close();

	}

}
