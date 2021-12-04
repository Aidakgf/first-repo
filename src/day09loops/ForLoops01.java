package day09loops;

public class ForLoops01 {

	public static void main(String[] args) {
		
		// 1) Type code to print unique characters on the console
		
		String s1 = "Anna Maria";
		
//		for (int i = 0; i < s1.length(); i++) {
//			char c = s1.charAt(i);
//			if(s1.indexOf(c)==s1.lastIndexOf(c)) {
//				System.out.print(c); //A Mri
//			}
//		}
		
		 // 2) Type code to print a String in reverse order after removing spaces
		 // Example: Ali Can ==> naCilA
		String s2 = "Ali Can";		
		String reversed = "";
		for(int i = s2.length()-1; i>=0; i--) {
//			String c = s2.substring(i, i+1);
//			if(c.equals(" ")) {
//				s2 = s2.replace(" ", "");
//			}else {
//				reversed = reversed + c;
//			}
		
		// or another way shorter
			
			char c = s2.charAt(i); // used charAt instead of substring
			
			if(c!=' ') {
				reversed = reversed + c;
			}
		}
		System.out.println(reversed); //naCilA
		
		
		
		// 3) Type code to find the sum of the integers from 12 to 15
		
		int sum = 0;
		for(int i=12; i < 15; i++) {
			sum = sum + i;
		}
		System.out.println(sum); //39 (12+13+14)
		
		
		// 4) Type code to find the multiplication of the integers from 3 to 7
		
		int multiplication = 1; // in multiplication we cannot use 0 as a initial value as it will
								// affect the resul 6*0=0
		
		for(int i=3; i<6; i++) {
			multiplication = multiplication * i;
		}
		System.out.println(multiplication); // 60
		
		
		// 5) Type code to check if the given String is Palindrom.
		// String: anna  Reversed String: anna
		// Integer: 12321 Reversed Integer: 12321 
		String s3 = "anna";
		String rev3 = "";

		for (int i = s3.length() - 1; i >= 0; i--) {
			rev3 = rev3 + s3.charAt(i);
		}
		System.out.println(rev3);
		
		if(s3.equals(rev3)) {
			System.out.println(s3 + " is palindrome");  // anna is palindrome
		}else {
			System.out.println(s3 + " is not palindrome");  //annaX is not palindrome
		}
		
		
		// 6) Type code to find the sum of the digits of an integer.
		
		//int n = 1243234; мы его обозначили ниже внутри лупа, но можно вначале
		
		int sumOfDigits = 0;
		for(int n=1243 ; n>0 ; n = n/10) {
			sumOfDigits = sumOfDigits + n%10;
		}
		System.out.println(sumOfDigits); // 10
		
		
		// 7) Type code to find the sum of the unique digits of an integer
		
		String sn = "2523";
		int sumOfUniqueDigits = 0;
		
		for(int i=0 ; i<sn.length(); i++) {
			
			char c = sn.charAt(i);
			
			if(sn.indexOf(c) == sn.lastIndexOf(c)) {
				
				String cs = "" + c;
				
				sumOfUniqueDigits = sumOfUniqueDigits + Integer.valueOf(cs);
				
			}			
		}
		System.out.println(sumOfUniqueDigits); // 8
		
		
		
		
		
		
	

	}
}
