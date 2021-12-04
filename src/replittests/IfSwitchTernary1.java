package replittests;

import java.util.Scanner;

public class IfSwitchTernary1 {

	public static void main(String[] args) {
		
		
		
		// int bodyMassIndex = weight / (height*height);
		
		Scanner scan = new Scanner(System.in);
		//System.out.println("Enter the weight in kg...");
		double a = scan.nextDouble();
		Scanner scan1 = new Scanner(System.in);
		//System.out.println("Enter the height in cm...");
		double b = scan1.nextDouble();
		
		double bodyMassIndex = a/(b*b);
		System.out.println("Your BMI is  :" + bodyMassIndex);
		
		if(bodyMassIndex < 18.5) {
			System.out.println("you are weak");
		}else if(bodyMassIndex >= 18.5 && bodyMassIndex<25) {
			System.out.println("Your weight is ideal");
		}else if(bodyMassIndex >= 25 && bodyMassIndex<30) {
			System.out.println("You are fat");
		}else{
			System.out.println("You are obese");
		}
			
		scan.close();
		

	}

}
