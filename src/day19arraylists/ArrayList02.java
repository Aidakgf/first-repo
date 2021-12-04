package day19arraylists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList02 {

	public static void main(String[] args) {
		// How to check if a collection of given elements exist in a list
		//["A", "M", "C", "K", "B"] ==> Check if "A", and "C", and "K" exist in the list
		
		List<String> list1 = new ArrayList<>();	
		list1.add("A");
		list1.add("M");
		list1.add("C");
		list1.add("K");
		list1.add("B");
		System.out.println(list1); //[A, M, C, K, B]
		
		// 1st way
		List<String> list2 = new ArrayList<>();
		list2.add("A");
		list2.add("C");
		list2.add("K");
		System.out.println(list2); // [A, C, K]
		
		// We use containsAll() method to check if a list contains another list
		System.out.println(list1.containsAll(list2)); //true
		
		// 2nd way
		// If you use a List() method, be careful, the length will not be changed
		System.out.println(list1.containsAll(Arrays.asList("A","C","K"))); // true
		
		List<Integer> list3 = Arrays.asList(3, 4, 6, 8);
//		list3.add(9);
//		System.out.println(list3); //UnsupportedOperationException
//		list3.remove(0);
//		System.out.println(list3); //UnsupportedOperationException
		
		System.out.println(list1); //[A, M, C, K, B]
		// Remove "C", and write "D" instead of it using list1
		// 1st way
		int idxOfC = list1.indexOf("C");
		list1.remove(idxOfC);
		list1.add(idxOfC, "D");
		System.out.println(list1);  //[A, M, D, K, B]
		
		// 2nd way, we use set(), to write a specific element at a specific index
		list1.set(idxOfC, "D");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
