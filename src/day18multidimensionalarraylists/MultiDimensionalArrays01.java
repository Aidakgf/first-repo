package day18multidimensionalarraylists;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {
		// Convert 2 dimensional array to 1 dimensional array
		//int arr[][]={ {1, 2}, {3, 4, 5}, {6, 7, 8, 9} }; ==> int brr[]= { 1, 2, 3, 4, 5, 6, 7, 8, 9};

		int arr[][]={ {1, 2}, {3, 4, 5}, {6, 7, 8, 9} };
		
		// Firstly we find the number of elements in arr[][]
		int brrLen =0;
		for(int[] w : arr) {
			brrLen=brrLen + w.length;
		}
		System.out.println(brrLen); // 9
		
		
		// Secondly we create brr[]
		int brr[]=new int[brrLen];
		System.out.println(Arrays.toString(brr)); // [0, 0, 0, 0, 0, 0, 0, 0, 0]
		
		
		// Finally we assign the elements of 2 dimensional array arr[][] to 1 dimensional array brr[]
//		int idx=0;
//		for(int[] w : arr) {
//			for(int x : w) {
//				brr[idx]=x;
//				idx++;
//			}
//		}
//		System.out.println(Arrays.toString(brr)); //[1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		// OR this way
		
		int idx=0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[i].length; j++ ) {
                brr[idx]=arr[i][j];
                idx++;
            }
        }
        System.out.println(Arrays.toString(brr));//[1, 2, 3, 4, 5, 6, 7, 8, 9]
		

	}

}
