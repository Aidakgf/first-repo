package day26exceptions;

public class Exception01 {
	
	/*
	 	1)	Exception: unexpected issues
	 	2)	When there is an exception
	 		i)	Java throws exception
	 		ii)	Java stops executing the rest of the codes
	 	3)	We can handle exceptions using "try-catch" blocks
	 	4)	"try" block can't be used alone, there must be "catch" or some other structures.
	 	5)	There can be multiple "catch" blocks after "try" block
	 	6)	i)	if there is no "parent-child" relation between exception classes,
	 			then the order of "catch" blocks is not important
	 		ii)	if there is "parent-child" relation between exception classes,
	 			then the child class exception must be first.
	 		
	 		
	 	
	 */

	public static void main(String[] args) {
		
		System.out.println(division(12,4));
		System.out.println(division(8,1));
		System.out.println(division(0,5));
		System.out.println(division(5,0)); // Java throws Exception.....ArithmeticException (type of exception)
		System.out.println(division(20,5));
		System.out.println("====================");
		
		int arr[] = {4, 2, 5, 6, 7};
		System.out.println(arraySumOfTwoConsecutiveElements(arr, 0));
		System.out.println(arraySumOfTwoConsecutiveElements(arr, 1));
		System.out.println(arraySumOfTwoConsecutiveElements(arr, 2));
		System.out.println(arraySumOfTwoConsecutiveElements(arr, 3));
		System.out.println(arraySumOfTwoConsecutiveElements(arr, 4)); //ArrayIndexOutOfBoundsException
		System.out.println("====================");
		
		int brr[] = {12, 4, 2, 0, 5};
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr, 0));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr, 1));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr, 2));//ArithmeticException
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr, 3));
		System.out.println(arrayDivisionOfTwoConsecutiveElements(brr, 4)); // ArrayIndexOutOfBoundsException

	}

	public static double division(int a, int b) {

//		if(b==0) {
//			System.out.println("do not divide by zero");
//			return 0;
//		}else {
//			return a/b;
//		}

		double result = 0;
		try {
			return a / b;
		} catch (ArithmeticException e) {
			System.out.println("do not divide by zero: " + e.getMessage());
		}
		return result;
	}
	
	public static int arraySumOfTwoConsecutiveElements(int arr[], int index) {
		
		int result=0;
		try {
		result =  arr[index] + arr[index + 1];
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("do not use non-existing index: " + e.getMessage());
		}
		return result;
		
	}
	
	public static int arrayDivisionOfTwoConsecutiveElements(int arr[], int index) {
		double result=0;
		try {
		result =  arr[index] / arr[index+1];
		} catch(ArithmeticException e) {
			System.out.println("do not divide by zero: " + e.getMessage());			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("do not use non-existing index: " + e.getMessage());
		}
		return result;
	
	
	}

}
