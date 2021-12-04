package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList05 {

	public static void main(String[] args) {
		// Increase the value of every element by 3 except 7
		// list1 = [ 3, 4, 7, 8, 11] ==> list2 = [ 6, 7, 7, 11, 14]

		List<Integer> list1 = new ArrayList<>();
		list1.add(3);
		list1.add(4);
		list1.add(7);
		list1.add(8);
		list1.add(11);
		System.out.println(list1); // [3, 4, 7, 8, 11]
		

		for (int i = 0; i < list1.size(); i++) {

			if (list1.get(i) != 7) {
				list1.set(i, list1.get(i) + 3);
			}
		}
		System.out.println(list1); //[6, 7, 7, 11, 14]
		
		
		
		
	}

}
