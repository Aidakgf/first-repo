package sundayjavapractice;

public class Palindrome {

	public static void main(String[] args) {
		/*
		 	Palindrome Create a program checks if a string is palindrome or not
		 	
		 */
		
		StringBuilder stb = new StringBuilder();
		
		stb.append("ibrahim");
		String name = "ibrahim";
		name = "yesim";
		
		System.out.println(stb.toString().equals(stb.reverse().toString()));
		
		System.out.println(stb.toString().equalsIgnoreCase(stb.reverse().toString()));

	}
	
	public static void palindrome(String name) {
		
		// student 1 example
//		public static void palindrome(String[] args) {
//			  String s1 = "Ibrahim";
//		        String rev1 = "";
//		       
//		        for(int i=s1.length()-1; i>=0; i--) {
//		            rev1 = rev1 + s1.charAt(i);
//		        }
//		       
//		        System.out.println(rev1);
//		        if(s1.equals(rev1)) {
//		            System.out.println(s1 + " is palindrome");
		
		
		// student 2
//		for(int i = 0; i<name.length(); i++) {
//			int j = 0;
//			if(name.indexOf(i) == name.indexOf(i-j)) {
//				System.out.println(name + " is palindrome");
//			}
//1:11
//yeaj i need J ++
//1:13
//My code doesn't work
		
		// student 3
//		boolean isPalindrome = true;
//		for (int i = 0; i < s.length(); i++) {
//			if (s.charAt(i) != s.charAt(s.length() - i -1))
//					isPalindrome = false;
		
		
		// teacher
		String reversed = "";
		for(int i = name.length()-1; i>=0; i--) {
			reversed += name.charAt(i);			
		}
		if(name.equalsIgnoreCase(reversed)) {
			System.out.println("This word is a palindrome! " + name);
			
		}else {
			System.out.println("This word is not a palindrome " + name);
		}
		
//		package practice1;
//		public class Palindrome {
//			public static void main(String[] args) {
//				/*
//				 * Palindrome Create a program checks if a string is palindrome or not
//				 */
//				
////				StringBuilder stb = new StringBuilder();
////				
//		//
////				stb.append("ibrahim");
//				String name ="civic";
//				
//				palindrome( name);
////				System.out.println(stb.toString().equals(stb.reverse().toString()));
////				
////				
////				
////				
////				
////				System.out.println(stb.toString().equalsIgnoreCase(stb.reverse().toString()));
//				//palindrome civic ibrahim / miharbi
//			}
//			
//			public static void palindrome(String name) {
//				
//				String reversed = "";
//				
//				for(int i = name.length()-1;i>=0 ; i-- ) {
//					
//					
//					reversed += name.charAt(i);
//					
//					
//				}
//				
//				if(name.equalsIgnoreCase(reversed)) {
//					System.out.println("This word is a palindrome! "+name);
//				}else {
//					System.out.println("this word is not a palindrome "+name);
//					
//				}
//				
//			}
//		}


		
		
	}

}
