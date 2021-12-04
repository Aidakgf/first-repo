package replittests;

public class AsciiValues8 {

	public static void main(String[] args) {
		
		// Write a Java program that prints ascii values of characters from ‘a’ to ‘z’
		
		char c = 'a';
        int ascii = 97;
        
        for(int i = c; i<='z'; i++) {
        	System.out.print(" Ascii value of " + c + " is: " + ascii);
        	c++;
        	ascii ++;
        }
        
	      


	}

}
