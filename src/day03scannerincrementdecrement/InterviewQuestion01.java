package day03scannerincrementdecrement;

import java.util.Scanner;

public class InterviewQuestion01 {

	public static void main(String[] args) {
		/*
		 Swapping two numbers:
		 Get two numbers from user then swap/exchange them.
		 User ==> a=5, b=10, then after swapping a=10, b=5.
		 */
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the fisrt number");
		int firstNum=scan.nextInt();
		System.out.println("Enter the second number");
		int secondNum=scan.nextInt();
		System.out.println("Before swap, The first number: " +firstNum+", The second number: " +secondNum);
		
		//1st way:
//		int temp=0;
//		temp=firstNum;
//		firstNum=secondNum;
//		secondNum=temp;
		
//		System.out.println("After swap, The first number: " +firstNum+", The second number: " +secondNum);
		
		//2nd way:
		firstNum=firstNum+secondNum; //1st is 10, 2nd is 20 = 30 first number
		secondNum=firstNum-secondNum; //30 - 20 = 10 second number
		firstNum=firstNum-secondNum; //30 - 10 = 20 first number
		
		System.out.println("After swap, The first number: " +firstNum+", The second number: " +secondNum);
		
		scan.close();
		
		
		
	}

}
