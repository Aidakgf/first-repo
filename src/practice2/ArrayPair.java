package practice2;

public class ArrayPair {
	
	/*
	 	from a given array find all pairs whose sum is a given number
	 	{4, 6, 5, -10, 8, 5,20} =====> 10
	 */

	public static void main(String[] args) {
		findPairs(new int[] { 4, 6, 5, -10, 8, 5, 20 }, 10);

		findPairs(new int[] { 4, -5, 9, 11, 25, 13, 12, 8 }, 20);

	}

	public static void findPairs(int arr[], int num) {

		// {4, 6, 5, -10, 8, 5,20}

		// 0 , 1, 2 etc 7
		for (int i = 0; i < arr.length; i++) { // this line will run 7 times

			for (int j = i + 1; j < arr.length; j++) { //this line will run 6 times

				if (arr[i] + arr[j] == num) {
					System.out.println(arr[i] + " + " + arr[j] + " = " + num);					
				}
			}
		}
	}
}
