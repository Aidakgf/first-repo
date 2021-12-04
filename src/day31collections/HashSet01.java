package day31collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/*
 	1)	"Set" is to store unique elements
 	2)	"Hashing" means to create an unique integer (hash code for each
 		object in the collection
 	3)	"HashSet" is to store unique elements in random order.
 	4)	"HashSet" is fast since it doesn't put elements in an order
 	5)	"HashSet" accepts "null" as element
 */

public class HashSet01 {

	public static void main(String[] args) {
		
		HashSet<String> hs1 = new HashSet<>();
		hs1.add("A");
		hs1.add("A");
		System.out.println(hs1); // [A]
		hs1.add(null);
		hs1.add(null);
		System.out.println(hs1); // [null, A]
		
		HashSet<String> hs2 = new HashSet<>();
		hs2.add("A");
		hs2.add(null);
		System.out.println(hs2); // [null, A]
		
		
		// equals() does not check the order of elements for HashSet
		System.out.println(hs1.equals(hs2)); // true
		
		// there is no remove() method, since the first element is not certain
		System.out.println(hs1.remove(null)); // true
		System.out.println(hs1); // [A]
		
		System.out.println(hs1.remove("B")); // false
		System.out.println(hs1); // [A]
		
		// Interview Question: Type a code to display ArrayList elements just once in random order
		// Example: [5, 3, 6, 1, 5, 6, 7, 1] ==> [3, 6, 
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(3);
		list.add(6);
		list.add(1);
		list.add(5);
		list.add(6);
		list.add(7);
		System.out.println(list); // [5, 3, 6, 1, 5, 6, 7]
		
		
		
		
		

	}

}
