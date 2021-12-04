package day15arrays;

import java.util.Arrays;

public class Arrays03 {

	public static void main(String[] args) {
		// [0, 2, 3, 0, 12, 0] put the zeros to the end
		
		int arr[]= {0, 2, 3, 0, 12, 0};
		System.out.println(Arrays.toString(arr)); //[0, 2, 3, 0, 12, 0] ==> [2, 3, 12, 0, 0, 0]
		
		int arrNew[]=new int[arr.length];
		//System.out.println(Arrays.toString(arrNew));
		
		int idx = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]!=0) {
				arrNew[idx]=arr[i];
				idx++;
			}
		}
		System.out.println(Arrays.toString(arrNew));

	}

}
