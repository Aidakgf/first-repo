package day18multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays02 {

	public static void main(String[] args) {
		
		// Find the maximum element in a 2 dimensional array
		int arr[][]= {{2,6} , {9, 1, 11} , {7, 13, 0}};
		
		// 1st Way
		// Firstly transfer all elements to a 1 dimensional array brr[]
		
				int brrLen =0;
				for(int[] w : arr) {
					brrLen=brrLen + w.length;
				}
				System.out.println(brrLen); 
				
				int brr[]=new int[brrLen];
				System.out.println(Arrays.toString(brr));
				
				int idx=0;
				for(int[] w : arr) {
					for(int x : w) {
						brr[idx]=x;
						idx++;
					}
				}
				System.out.println(Arrays.toString(brr)); //[2, 6, 9, 1, 11, 7, 13, 0]
				
				// Then we sort the array brr[], and we take the element at the last index
				Arrays.sort(brr);
				System.out.println(Arrays.toString(brr)); //[0, 1, 2, 6, 7, 9, 11, 13]
				System.out.println("The biggest element: " + brr[brr.length-1]); //The biggest element: 13
				
				// 2nd Way
				int a = Integer.MIN_VALUE;
				for(int[] w : arr) {
					for(int x : w) {
						if(a<x) {
							a=x;
						}
					}
				}
				System.out.println("The biggets element: " + a); //The biggets element: 13
				
				//in order to get biggest element we change min.value to max.value and "a<x" to "a>x"
				

				
				


	}

}
