package sundayjavapractice;

public class FibonacciSequence {
	/*
	 * Type a program that will print all Fibonacci Sequence on the console 0, 1, 1,
	 * 2, 3, 5, 8, etc. Create a number to indicate how many times you need to run.
	 */

	public static void main(String[] args) {

		// student 1
		int n = 10;
		int firstTerm = 0;
		int secondTerm = 1;
//
//		int i = 0;
//		int thirdTerm = 0;
//
//		System.out.print(firstTerm + " " + secondTerm); // 0 1 1 2 3 5 8 13 21 34
//
//		for (i = 2; i < n; ++i) {
//			thirdTerm = firstTerm + secondTerm;
//			System.out.print(" " + thirdTerm);
//			firstTerm = secondTerm;
//			secondTerm = thirdTerm;
//		}
		
		for(int i = 0; i <= n ; i++) {
			System.out.print(firstTerm+", "); // 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55,
			int temp = firstTerm + secondTerm; // 1, 2
			firstTerm = secondTerm; // 1, 1 etc 
			secondTerm = temp; // 1, 2 etc
			
		}

		
	}

}
