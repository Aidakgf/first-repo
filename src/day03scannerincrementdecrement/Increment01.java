package day03scannerincrementdecrement;

public class Increment01 {
	
	public static void main(String[] args) {
		
		//Increment is to increase the value of a number variable by "+" and "*"
	
		//1st way:
		int num1 = 3;
		num1 = num1 + 2;
		System.out.println(num1); //5
		
		num1 = num1+10;
		System.out.println(num1); //15
		
		num1=num1*2; 
		System.out.println(num1); //30
		
		//2nd way:
		num1 += 4; //this is the same as num1 = num1 + 4; "+" and "=" should be written without space, 
					//do not separate operation and equality signs.
		System.out.println(num1); //34
		
		num1 *= 3; //this is the same as num1= num1*3
		System.out.println(num1); //102
		
		//3rd way is ONLY for increasing by 1
		num1++;
		System.out.println(num1); //103
		
		
		
		
	}

}
