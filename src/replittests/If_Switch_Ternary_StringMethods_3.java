package replittests;

import java.util.Scanner;

public class If_Switch_Ternary_StringMethods_3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Please enter two integer");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		long sum = num1 + num2 ;
		if((sum) >= 1000000000 ) {
			System.out.println("Overflow");
		}else {
			System.out.println("Sum of the numbers: " + (num1+num2));
		}
		
		scan.close();
	}
}
