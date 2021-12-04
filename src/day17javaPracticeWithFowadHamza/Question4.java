package day17javaPracticeWithFowadHamza;

public class Question4 {

	package java_practice;

	
	  public static void main(String[] args) {

	    // Print "Boom" if the digit 7 is displayed in an integer array
	    int[] arr = {2, 7, 9};
	    int flag=0;
	    for (int i = 0; i < arr.length; i++) {
	      int temp= arr[i];
	      while(temp>0){
	      if(temp%10==7){
	        System.out.println("BOOM!! We found 7");
	        flag = 1;
	        break;
	      }
	      temp = temp/10;
	      }
	    }
	    if(flag==0){
	    System.out.println("There is no 7 found");
	  }
	}

}
