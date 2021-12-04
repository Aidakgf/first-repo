package day06nestedternaryswitchstringmanipulation;

import java.util.Scanner;

public class Homework {

	public static void main(String[] args) {
		
		//#1
		
//		String gender = "female";
//		
//		int age = 20;
//	
//				
//		if(gender.equals("male")) {
//				if(age<20) {
//					System.out.println("Boy");
//				}else {
//					System.out.println("Man");
//				}
//		}else if(gender.equals("female")) {
//				if(age<20) {
//					System.out.println("Girl");
//				}else {
//					System.out.println("Woman");
//				}
//		}else {
//			System.out.println("There is no any definition for other genders");
//		}
		
		
		//#2
//		int quantity = 900;
//		int unitPrice = 100;
//		
//		if(quantity>1000) {
//			if(unitPrice>30) {
//				System.out.println("10% Discount");				
//			}else {
//				System.out.println("5% Discount");
//			}
//				
//		}else {
//			if(unitPrice>100) {
//				System.out.println("4$ Discount");
//			}else {
//				System.out.println("No Discount");
//			}
//		}
//		
		//#3
		
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Enter your name");
//		String day = scan.next();
//		
//		char ch1 = day.charAt(1);
//		char ch2 = day.charAt(3);
//		
//		System.out.println("Result:" + ch1 + ch2);
		
		//#4
		
//		String str1 = "JAVA";
//		String str2 = "Java";
//		String str3 = "JAVA";
//		System.out.println(str1.equals(str2));
		
		//#5
		
//		int year = 1990;
//		
//		if(year%100==0) {
//			if(year%400==0) {
//				System.out.println(year + " is lucky leap year");
//			}else {
//				System.out.println(year + " is not lucky leap year");
//			}
//		}else {
//			if(year%4==0) {
//				System.out.println(year + " is simple leap year");
//			}else {
//				System.out.println(year + " is not simple leap year");
//			}
//		}
		
		//#6
		
//		int y = 5;
//		int x = y>5 ? 3*y : 4*y;
//		System.out.println(x = y>5 ? 3*y : 4*y);
//		
		//#7
		
//		int y = 'a';
//		System.out.println(y>=0 && y<9 ? 11: "Java");
				
		//#8
		
//		int a = 29;
//		String result = (a%2!=0 && a>29)?("Good"):("Bad");
//		System.out.println(result);
		
		//#9
		
//		int a = 7;
//		if(a>10) {
//			System.out.println("Good");
//		}else {
//			System.out.println("Bad");
//		}
		
//		int a = 11;
//		System.out.println(a>10?"Good":"Bad");
		
//		char ch = 'K';
//		String result = ch>='A' && ch<='Z' ? "Bad" : "Good";
//			System.out.println(result);
		
//		int a = 10;
//		String result = a>10 ? "Good" : "Bad";
//		System.out.println(result);
		
//		char ch = 'm';
//				System.out.println(ch>='a' && ch<='z' ? "Bad" : "Good");
		
		//#10
		
//		int a = -5;
//		int result = a<0 ? (-1)*a : a;
//		System.out.println(result);
		
//		int a = -5;
//		if(a>0) {
//			System.out.println(a);
//		}else {
//			System.out.println((-1)*a);
//		}
		
//		int a = 5;
//		if(a<0) {
//			System.out.println((-1)*a);
//		}else {
//			System.out.println(a);
//		}
		
		String str = "monchar";
		int lastIdx = str.lastIndexOf("ar");
		System.out.println(lastIdx);
		
		
	}

}




