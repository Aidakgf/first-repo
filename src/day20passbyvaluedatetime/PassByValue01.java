package day20passbyvaluedatetime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PassByValue01 {
	
	/*
	 	Pass by Value: If you use a variable inside a method
	 	Java creates a copy of the variable, and uses the copy of the value of the variable
	 	instead of the original value of the variable. Java does not use the variable itself,
	 	it protects the original value of the variable.
	 	This process is called "PASS BY VALUE".
	 */

	public static void main(String[] args) {
		
		// 1) Primitive data type is "immutable"
		int num =5;
		System.out.println("The value of num before the increase method: " + num);  // 5
		System.out.println("The return value with increase method" + increase(num));  // 10
		System.out.println("The value of num after the increase method: " + num);  // 5
		
		// 2) String is "immutable"
		// If you can't update a variable without assignment, it is called "immutable"
		String s = "Ali";
		System.out.println("The string before the method updateString" + s); //  Ali
		System.out.println("The return value with the method updateString" + updateString(s)); // ALi!
		System.out.println("The string after the method updateString" + s); // Ali
		
		// 3) Array is "mutable" as it was changed by method.
		int arr[] = new int[3];
		arr[0]=7;
		arr[1]=4;
		arr[2]=10;
		System.out.println("Array before the method" + Arrays.toString(arr)); // [7, 4, 10]
		Arrays.sort(arr); 
		System.out.println("Array after the method" + Arrays.toString(arr)); // [4, 7, 10]
		
		// 4) List is "mutable"
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(11);
		list.add(12);
		System.out.println("The list before the method updateList" + list); // [10, 11, 12]
		updateList(list);
		System.out.println("The list after the method updateList" + list); // [11, 12]
		

	}
	
	public static int increase(int i) {
		return i + 5;
	}
	
	public static String updateString ( String s) {
		return s+ "!";
	}
	
	public static List<Integer> updateList(List<Integer> list){
        list.remove(0);
        return list;
	}

}
