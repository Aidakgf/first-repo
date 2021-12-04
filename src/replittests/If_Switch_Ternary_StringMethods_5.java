package replittests;

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a month number");
		int monthNumber = scan.nextInt();
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Enter a year");
		int year = scan.nextInt();
		
		int days = 0;
		String month = "";
		
		switch(monthNumber) {
		case 1:
			month = "January";
			days = 31;
			break;
		case 2:
			month = "February";
			days = (year%100==0) ? ((year%400==0) ? 29 : 28) : ((year%4==0) ? 29 : 28);
			break;
		case 3:
			month = "March";
			days = 31;
			break;
		case 4:
			month = "April";
			days = 30;
			break;
		case 5:
			month = "May";
			days = 31;
			break;
		case 6:
			month = "June";
			days = 30;
			break;
		case 7:
			month = "July";
			days = 31;
			break;
		case 8:
			month = "August";
			days = 31;
			break;
		case 9:
			month = "September";
			days = 30;
			break;
		case 10:
			month = "October";
			days = 31;
			break;
		case 11:
			month = "November";
			days = 30;
			break;
		case 12:
			month = "December";
			days = 31;
			break;
		}
		
		System.out.println(month + " " + year + " has " + days + " days");
		


	}

}
