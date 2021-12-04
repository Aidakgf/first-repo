package day33maps;

/*
 	Ask user to enter the number of lines of a pyramide.
 	Type a program to crate the pyramide.
 	For example if the number of lines is 5, the pyramide will be like:
 	        *
 	      * * *
 	    * * * * *
 	  * * * * * * *
 	* * * * * * * * * 
 	
 */

public class InterviewQuestion02 {

	public static void main(String[] args) {
		
		
		int numOfRows = 5;
		
		for(int i=1; i<=numOfRows; i++) {
			
			for(int space = 1; space<=numOfRows-i; space++) {
				System.out.print("  ");
			}
			
//			while(k!=2*i-1) {
//				System.out.print("* ");
//				k++;
//			}
//			int k = 0; for(int i=1; i<=numOfRows; i++; k=0)
			
			for(int j=0; j<2*i-1; j++) {
				System.out.print("* ");

			}
			
			
			System.out.println();
		}
		
		

	}

}
