package day31collections;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

/*
 	1)	"LinkedHashSet" is to store unique elements in insertion order
 	2)	"LinkedHashSet" accepts "null" as element
 */

public class LinkedHashSet01 {

	public static void main(String[] args) {
		
		LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
		lhs1.add(8);
		lhs1.add(2);
		lhs1.add(5);
		lhs1.add(9);
		lhs1.add(null);
		System.out.println(lhs1); // [8, 2, 5, 9, null]
		lhs1.add(2);
		System.out.println(lhs1); // it will not print, as 2 already exists in a list, [8, 2, 5, 9, null]
		lhs1.add(7);
		System.out.println(lhs1); // [8, 2, 5, 9, null, 7]
		
		// Interview Question: Type a code to display ArrayList elements just once in insertion order
		// Example: [5, 3, 6, 1, 5, 6, 7] ===> [5, 3, 6, 1, 7]
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list); // [5, 3, 6, 1, 5, 6, 7]
		
		LinkedHashSet<Integer> lhs2 = new LinkedHashSet<>();
		lhs2.addAll(list);
		System.out.println(lhs2); // [5, 3, 6, 1, 7]
		
		
		
		
		
		

	}

}
