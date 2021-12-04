package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		// How to remove duplicate elements from ArrayList
		List<Integer> list1 = new ArrayList<>();
		list1.add(2);
		list1.add(5);
		list1.add(5);
		list1.add(8);
		list1.add(2);
		System.out.println(list1); //[2, 5, 5, 8, 2]
		
		List<Integer> list2=new ArrayList<>();
		System.out.println(list2); // []
		
		for(int w : list1) {
			if(!list2.contains(w)) {
				list2.add(w);
			}
		}
		System.out.println(list2); //[2, 5, 8]
		
		

	}

}
