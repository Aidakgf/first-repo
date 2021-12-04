package day03scannerincrementdecrement;

public class Decrement01 {

	public static void main(String[] args) {
		// Decrement is decreasing the value of a number variable by "-" and "/"
		
		//1st way
		int num2 = 1;
		num2 = num2 - 3;
		System.out.println(num2); //-2
		
		//2nd way
		num2 -= 4; 
		System.out.println(num2); //-6
		
		num2 /= 3;
		System.out.println(num2); //-2
		
		//3rd way is only decreasing by 1
		num2--;
		System.out.println(num2); //-3
		
		

	}

}
