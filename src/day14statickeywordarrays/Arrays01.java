package day14statickeywordarrays;

import java.util.Arrays;

/*
	 	Arrays: 1) Arrays are to store multiple data in a single container
	 			2) All data in an array must be same
	 			3) Arrays can accept only "primitives" and "references" as element
	 				Array can't accept "non-primitives" as data type
	 			4) Array is non-primitive
	 			
	 */

public class Arrays01 {  //множества, массивы

	public static void main(String[] args) {
		
		
		// How to create array
		int arr1[] = new int[4];   // possible creations int[] arr1,   int []arr1 = new int[4]; , int arr1[]
		
		// How to print on the console
		System.out.println(arr1);  // It turns the address of array [I@129a8472
		System.out.println(Arrays.toString(arr1));  //[0, 0, 0, 0]
		
		// How to add elements in an array
		arr1[0]=4;
		System.out.println(Arrays.toString(arr1)); //[4, 0, 0, 0]
		arr1[3]=8;
		System.out.println(Arrays.toString(arr1)); //[4, 0, 0, 8]
		// make second element 7, third element 10
		arr1[1]=7;
		System.out.println(Arrays.toString(arr1)); //[4, 7, 0, 8]
		arr1[2]=10;
		System.out.println(Arrays.toString(arr1)); //[4, 7, 10, 8]
		
		// How to print a specific element on the console
		System.out.println(arr1[0]); //4
		//System.out.println(arr1[4]); // ArrayIndexOutOfBoundsException: Index 4 out of bounds for length 4
									// no red underline, not Compile Time Error
									// if we get error message after we run the code, then it is Run Rime Error
		
		// How to get the number of elements in an array
		System.out.println(arr1.length);  //4
		
		// How to get the first element
				System.out.println(arr1[0]); // 4
		
		// How to get the last element
		System.out.println(arr1[arr1.length-1]); //8
		
		// How to put elements in accending order
		//Arrays.sort(arr1); // sort() method updates array
		System.out.println(Arrays.toString(arr1)); //[4, 7, 8, 10]
		
		// How to print smallest element on the console
		// Firstly we use sort() method to put elements from the smallest to the biggest
		// then the element with "index 0" is the smallest element
		Arrays.sort(arr1);
		System.out.println(arr1[0]); //4
		
		// How to print the biggest on the console
		// Firstly we use sort() method to put elements from the smallest to the biggest
		// then the element with "index 'arr1.length-1" is the biggest element
		System.out.println(arr1[arr1.length-1]); //10
		
		// Create a String Array, put "Ali", "Veli", "Mete", "Can" as elements
		// sort the elements
		// find the last element
		String arr2[] = new String[4];
		System.out.println(Arrays.toString(arr2)); //[null, null, null, null]
		arr2[0]="Ali";
		System.out.println(Arrays.toString(arr2)); //[Ali, null, null, null]
		arr2[1]="Veli";
		System.out.println(Arrays.toString(arr2)); //[Ali, null, null, null]
		arr2[2]="Mete";
		System.out.println(Arrays.toString(arr2)); //[Ali, Veli, Mete, null]
		arr2[3]="Can";
		System.out.println(Arrays.toString(arr2)); //[Ali, Veli, Mete, Can]
		// to sort
		Arrays.sort(arr2);
		System.out.println(arr2[0]); //Ali
		// to find the last element
		System.out.println(arr2[arr2.length-1]); //Veli
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
