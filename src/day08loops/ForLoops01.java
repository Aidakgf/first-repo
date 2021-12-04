package day08loops;

public class ForLoops01 {

	public static void main(String[] args) {
		
		//Type code to print "Hello!" on 3 different lines
		
		// 1st way: not recommeneded
		System.out.println("Hello!");
		System.out.println("Hello!");
		System.out.println("Hello!");
		
		//2nd way:
		// We use LOOPS for repeating tasks
		// The loops are
		//	1) for-loop
		//	2) while-loop
		//	3) do-while-loop
		//	4) for-each-loop
		System.out.println("====================");
		
		for( int i=1 ; i<4 ; i++ ) {
			System.out.println("Hello");
		}
		
		
		
		System.out.println("====================");
		
		
		
		
//		//Type all integers from 11 to 44 the same line with a space between consecutive integers
		
//		
//		for( int i=11 ; i<45 ; i++) {
//			System.out.print(i + " "); //11 12 13 14 15 16 17 18 19 20 21 22 23 24 25 26 27 28 29 30 31 32 33 34 35 36 37 38 39 40 41 42 43 44
//		}
//		
		
		
		
		// Type all even integers from 11 to 120 the same line with a space between consecutive integers
		
		// 1 st way
		
//		for ( int i=11; i<121; i++) {
//			if(i%2==0){
//				System.out.print(i + " ");
//				}
//			}
//		// 2nd way
//		for(int i=12 ; i<121; i=i+2) {
//			System.out.print(i);
//		}
		
		//Type all odd integers from 120 to 11 in the same line with a space between consecutive integers
		
//		for(int i=120; i>10; i--) {
//			if (i%2!=0) {
//				System.out.print(i + " ");
//			}
//		}
		
		// Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space
		//between consecutive integers
		
//		for (int i=120; i>10; i--) {
//			if (i%4==0 && i%6==0) {
//				System.out.print(i + " ");
//			}
//		}
		
		//Using the String "Java", type "J*a*v*a*" on the console
		
		//String s1 = "Java";
		
//		for(int i=0; i<4; i++) {
//			System.out.print(str.charAt(i) + "*");
//		}
		
		
		
		//Type code to print all unique characters on the console from a given String with a space between them
		// "Java" ---------> J is unique, and v ==> Jv
		
		String s1 = "Java";
		
		for(int i=0; i<s1.length(); i++) {
			char c = s1.charAt(i);
			if(s1.indexOf(c)==s1.lastIndexOf(c)) {
				System.out.print(c);
				
			}
			
		}
			//HOMETASK!!!!!!!!!!!!!!!!

	
	}
		
	

}
