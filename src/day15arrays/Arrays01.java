package day15arrays;

import java.util.Arrays;

public class Arrays01 {

	public static void main(String[] args) {
		// Create an array, whose elements are "Ali", "Bekir", "Zehra", "Yasin", "Mary",
		//and then print the elements in alphabetical order on the console in different lines
		
//		String arr[] = new String[5];
//		System.out.println(Arrays.toString(arr)); //[null, null, null, null, null]
//		
//		arr[0]="Ali";
//		arr[1]="Bekir";
//		arr[2]="Zehra";
//		arr[3]="Yasin";
//		arr[4]="Mary";
//		System.out.println(Arrays.toString(arr)); //[Ali, Bekir, Zehra, Yasin, Mary]
//		
		// How to write in a shorter way
		String arr[] = {"Ali", "Bekir", "Zehra", "Yasin", "Mary"}; 
		System.out.println(Arrays.toString(arr));  //[Ali, Bekir, Zehra, Yasin, Mary]
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr)); //[Ali, Bekir, Mary, Yasin, Zehra]
		
		for( int i=0 ; i<arr.length ; i++) {
			System.out.println(arr[i]);
		}
		
		//Print the elements in reversed alphabetical order on the console in different lines
		
		for(int i=arr.length-1 ; i>=0 ; i--) {
			System.out.println(arr[i]);
		}
		
		
		

	}

}
