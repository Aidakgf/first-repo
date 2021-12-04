package day09loops;

public class NumberPalindrome {

		import java.util.*;
		import java.io.*;
		  public static void main(String[] args) {
		   Scanner input = new Scanner(System.in);
		   System.out.println("Enter value of n : ");
		   int n = input.nextInt();
		   int d;
		   int temp;
		   int rev=0;
		   temp=n; // n value will be changed later in the prog.
		   //so maintain a copy of n in temp
		   while(n>0)
		   {
		     d = n%10; // To extract last digit
		     rev = rev*10+d; // To reverse the given number
		     n = n/10; // To remove last digit
		   }
		   System.out.println("Reversed number is : "+ rev);
		   if(rev==temp)
		   System.out.println("Given number is a palindrome");
		   else
		   System.out.println("Given number is not a palindrome");
		  }
		
	}


        