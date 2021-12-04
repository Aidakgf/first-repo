package practicewithgroup01;

public class ForLoops01 {

	public static void main(String[] args) {
		
		//Type code to print "Hello!" 10 times on the console
		
		for(int i=1 ; i<11 ; i++) {
			
			System.out.println("Hello");
			
		}
		System.out.println("================");
		
		
		
		//Type all integers from 11 to 44 in the same line with a space between consecutive integers.
		for (int i = 11; i <= 44; i++) {

			System.out.print(i + " ");
		}
		
		System.out.println();
		System.out.println("============");

		
		
		// Type all integers which are divisible by 4 and divisible y 6 from 120 to 11 in the same line 
		// with a space between consecutive integers.
		
		for (int i = 120; i >= 11; i--) {
			if (i % 4 == 0 && i % 6 == 0) {
				System.out.print(i + " "); // 120 108 96 84 72 60 48 36 24 12
			}
		}
		
		/*
		 		true	&& 	true 	= 	true
		 		true	%% 	false 	= 	false
		 		false	&& 	true 	= 	false
		 		false	&& 	false	= 	false
		 		
		 		true 	|| 	true 	= 	true
		 		true 	|| 	false 	= 	true
		 		false	|| 	true 	= 	true
		 		false 	|| 	false 	= 	false
		 */
		
		System.out.println();
		
		// Convert Javamr to J*a*v*a*m*r
		String s = "Javamr";
		
		for(int i=0; i<=s.length()-1; i++) {
			System.out.print(s.charAt(i) + "*");			
		}
		
		System.out.println();
		
		// Type code to print all unique characters on the console from a given String
		
		String s1 = "Merhaba"; // ==>> "M e r h b
		
		for(int i = 0; i<= s.length()-1; i++) {
		char c = s1.charAt(i);
			if(s1.indexOf(c) == s1.lastIndexOf(c)) {
				System.out.print(c);  //Merhb
			}			
		}
	}
}
