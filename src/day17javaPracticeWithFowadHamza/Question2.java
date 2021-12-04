package day17javaPracticeWithFowadHamza;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	    System.out.println("Please provide first number and press Enter: ");
	    int start = scan.nextInt();
	    System.out.println("Please provide last number and press Enter: ");
	    int last = scan.nextInt();
	// we need to iterate through start -> end but we need only even numbers
	    int sum=0;
	    for(int i=start;i<=last;i++){
	      if(i%2==0){
	        System.out.println("Even Values are "+i);
	        sum= sum+i;
	      }
	    }
	    System.out.println("Sum of even numbers between: "+start+"and "+last+"is"+sum);
	  }
	
	

}
