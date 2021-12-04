package day17javaPracticeWithFowadHamza;

public class Question6 {

	public static void main(String[] args) {
		
		
		// Find the n vowels in a sentence!
	    String str= "elanur Selcuksds  iuouisd";
	    String vowel="";
	    int n=4;
	    for(int i=0;i<str.length();i++){
	      System.out.println("Charecter"+str.charAt(i));

	      if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u')
	      {
	        vowel = vowel+str.charAt(i);
	      }
	      if(vowel.length()==n)
	      {
	        break;
	      }
	    }
	    System.out.println("The vowels are "+vowel);
	  }
	

	}

}
