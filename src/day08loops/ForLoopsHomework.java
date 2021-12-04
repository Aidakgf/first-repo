package day08loops;

public class ForLoopsHomework {

	public static void main(String[] args) {

		for (int i = 1; i < 7; i++) {
			System.out.println("Hello!!!" + "  ");
		}

		System.out.println();

		for (int i = 1; i < 10; i++) {
			System.out.print(i + " ");

		}

		System.out.println();

		// Type all even integers from 11 to 120 the same line
		// with a space between consecutive integers

		for (int k = 11; k < 121; k++) {
			if (k % 2 == 0) {
				System.out.print(k + " ");
			}
		}

		System.out.println();

		for (int i = 12; i < 121; i = i + 2) {
			System.out.print(i + " ");
		}

		System.out.println();

		// Type all odd integers from 120 to 11 in the same line with a space between
		// consecutive integers

		for (int i = 120; i > 10; i--) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
		
		// Type all integers which are divisible by 4 and divisible by 6 from 120 to 11 in the same line with a space
		//between consecutive integers
		
		for(int i = 120; i > 10; i--) {
			if(i%4==0 && i%6==0) {
				System.out.print(i + " ");
			}			
		}
		
		System.out.println();
		
		// Convert "Java" to "J*a*v*a"
		
		String s = "Java";
		
		for(int i = 0; i<4; i++ ) {
			System.out.print(s.charAt(i) + "*");
		}
		
		System.out.println();
		
		String t = "Bingo";
		
		for(int i = 0; i<t.length(); i++ ) {
			System.out.print(t.charAt(i) + "*");
		}
		
		System.out.println();
		
		
		

		
		
		
		
		
		
	}
}
