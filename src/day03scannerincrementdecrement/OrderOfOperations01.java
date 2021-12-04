package day03scannerincrementdecrement;

public class OrderOfOperations01 {

	public static void main(String[] args) {
		/*
		 In Math, operations must be done according to the order of operations (BEDMAS);
		 1) B : Inside brackets, operations must be done firstly
		 2) E : Exponentials must be calculated
		 3) DM : Then Divisions and Multiplications
		 4) AS : The Additions and Subtraction at the end.
		 */

		//38 /2 - ( 4 + 3 ) * 2 = ?
		System.out.println(38 /2 - ( 4 + 3 ) * 2); //5
		
		//8 + 2 * ( 14 - 6 / 2 ) - 12 = ?
		System.out.println(8 + 2 * ( 14 - 6 / 2 ) - 12); //18
		
		
	}

}
