package day19arraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList06 {

	public static void main(String[] args) {
		// Create a method to delete odd elements and increase the even elements by multiplying 5
		
		List<Integer> list = new ArrayList<>();
		list.add(5);
		list.add(8);
		list.add(9);
		list.add(11);
		list.add(12);
		
		System.out.println(list); //[5, 8, 9, 11, 12] ==> [40, 60]
		
		System.out.println(deleteOddsMultiplyEvensBy5(list)); //[40, 60]
	}
	
	// to create a method to delete, don't forget to put "return list" at the end of the method
	public static List<Integer> deleteOddsMultiplyEvensBy5(List<Integer> list){
		for(int i=0 ; i<list.size() ; i++) {
			if(list.get(i) % 2 ==1 ) {
				list.remove(i);
				i--;
			}else {
				list.set(i, list.get(i) * 5);
			}
		}
		return list;		
	}
	
	
	

}
