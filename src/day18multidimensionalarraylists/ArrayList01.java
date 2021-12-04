package day18multidimensionalarraylists;

import java.util.ArrayList;
import java.util.List;

public class ArrayList01 {

	public static void main(String[] args) {
		
		// Disadvantage of Array is that the length must be declared at the beginning
		// and can't be changed. If the length is 100, we can't add 101st element or more than 100 elements
		
		// ArrayList: 	1) The length of ArrayList is "flexible"
		//				2) ArrayList can store only non-primitive data-types (we should write wrapper class instead int=Integer,
		//																											char=Character)
		
		// How to declare ArrayList
		
		// 1st way
		ArrayList<Integer> list1 = new ArrayList<>();
		
		// 2nd way
		ArrayList<Integer> list2 = new ArrayList<Integer>(); //Integer in the 1st diamond is must, in the 2nd is optional
		
		// 3rd way RECOMMENDED
		List<Integer> list3 = new ArrayList<>();
		System.out.println(list3); // []
		
		// How to add elements
		// The order of elements is the order of insertion
		list3.add(8);
		list3.add(5);		
		list3.add(3);
		System.out.println(list3); //[5, 8, 3] if we change order of declared elements they will be changed in the array too. Up to down.
		
		// How to add an element in a specific index
		list3.add(1, 10);
		System.out.println(list3); //[8, 10, 5, 3]
		System.out.println(list3.add(20)); //true - Java's logic - yes, i did add 20, it is true
		System.out.println(list3); // [8, 10, 5, 3, 20]
		list3.add(2, 100);
		System.out.println(list3); // [8, 10, 100, 5, 3, 20]
		
		// How to get the length of list
		System.out.println(list3.size()); // 6
		
		// How to check a list is empty	
		System.out.println(list3.isEmpty()); //false
		System.out.println(list1.isEmpty()); //true
		
		// How to check if there is a specific element
		System.out.println(list3.contains(100)); // true
		System.out.println(list3.contains(0));  // false
		
		// How to remove a specific element from list
		// if we write a number inside remove method, Java uses it as index
		System.out.println(list3.remove(0));  //8 it turns the removed element
		
		list3.remove(1);
		System.out.println(list3); // [10, 5, 3, 20]
		
		List<String> list4 = new ArrayList<>();
		list4.add("Ali Can");
		list4.add("Veli Han");
		list4.add("Kemal Efe");
		System.out.println(list4); //[Ali Can, Veli Han, Kemal Efe]
		
		//to remove one element
		list4.remove(0);
		System.out.println(list4); //[Veli Han, Kemal Efe]
		// In String list, we can write the String element inside remove() method and remove that element
		list4.remove("Veli Han");
		System.out.println(list4);  //[Kemal Efe]
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		

	}

}
