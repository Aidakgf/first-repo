package day05nestedifternary;

public class Ternary01 {

	public static void main(String[] args) {
		/*
		If an integer is positive print "The integer is positive" otherwise print "The integer is not positive"
		 */
		
		// 1st way using if-else
		
//		int num=10;
//		if(num>0) {
//			System.out.println("The integer is positive");
//		} else {
//			System.out.println("The integer is not positive");
//		}
		
// all these lines can be written in one line, see below:
		
		int num=10;
		if(num>0) {System.out.println("The integer is positive");} else {System.out.println("The integer is not positive");}
		
		
		// 2nd way using TERNARY
		
		String result= num>0	?	"The integer is positive"   :  	"The integer is not positive";
		System.out.println(result);
		
		//Write a program to print the minimum of 2 integers on the console. Use ternary..
		int num1=10;
		int num2=5;
		int min = num1 < num2 ? num1 : num2;
		System.out.println(min +  " is minimum");
		
		//Write a program to print absolute value of an integer.
		//absolute values are positive
		// abs(10)=10, abs(-5)= 5, abs(0) = 0
		// to get absolute value of a negative number multiply by -1
		
		int num3 = -7;
		int abs = num3 >= 0 ? num3 : -1*num3;
		System.out.println(abs);
		
		
		
	}

}
