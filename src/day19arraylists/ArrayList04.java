package day19arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList04 {

	public static void main(String[] args) {
		//Find the closest 2 integers in the given list (with the minimum difference between them)
		List<Integer> list1 = new ArrayList<>();
		list1.add(13);
		list1.add(7);
		list1.add(21);
		list1.add(31);
		list1.add(25);
		list1.add(35);
		System.out.println(list1); //[13, 7, 21, 31, 25]
		
		// To sort a list, we use collections.sort() method
		Collections.sort(list1);
		System.out.println(list1); // [7, 13, 21, 25, 31]
		
		
		// to find min value first
		int minDiff = Integer.MAX_VALUE;
		for(int i=1; i<list1.size() ; i++ ) {
			minDiff = Math.min(  minDiff, list1.get(i)-list1.get(i-1) );
		}
		System.out.println(minDiff); //4
		
		// to find which numbers are that with the min difference
		for(int i=1; i<list1.size() ; i++ ) {
			if(list1.get(i)-list1.get(i-1) == minDiff ) {
				
				System.out.println(list1.get(i) + " and " + list1.get(i-1) );  //25 and 21
			}
		}
		
		
		
		
		

	}

}
