package day12variabletypesmethodoverloadingconstructors;

public class MethodOverloading01 {
	
	/*
	 	Method Overloading: if you use same method name for different methods, it is called "method overloading"
	 					Question: How do you achieve "method overloading"?
	 								1) By using different number of parameters
	 								2) By using different data types for parameters (int, short, etc)
	 								3) If the data types of parameters are different you can change the order (int,short==>short,int)
	 								
	 								
	 								
	 */

	public static void main(String[] args) {
		
		// add(3,5); 	//This is "method call"
					//Real values used for parameters in method call are called "Arguments"		
		add(-2, 12, 32);		
		add(3, 5.2);		
		add(1.2, 5);		
		add(2, 3);
	}
	
//	public static void add(int a, int b) { //when you create a method, if you create variables inside the method parenthesis
//											// it s called "parameteres"
//		System.out.println("The sum is " + (a+b));
//	}
	public static void add(int a, int b, int c) {
		System.out.println("The sum is " + (a+b+c));
	}
	
	public static void add(double x, int y) {
		System.out.println("*** The sum is " + (x+y));		
	}
	
	public static void add(double x, double y) {
		System.out.println("/// The sum is " + (x+y));
	}

}
