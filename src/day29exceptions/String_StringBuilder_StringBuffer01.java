package day29exceptions;

/* 
 	1)	StringBuffer and StringBuilder mutable classes
 	2)	StringBuffer(Java 1) is created before StringBuilder (Java 5) in Java
 	3)	StringBuffer is thread-safe and synchronized class,
 		but StringBuilder is not thread-safe and synchronized class
 		
 		Thread-safe means multiple tasks can be done at the same time without any issue (like mobile phone: voice transfer, 
 		video, file transfer etc)
 		
 		If you do not want Java to execute multi-threads in random order, you need to
 		synchronize the multi-threads.
 		
 		
 */

public class String_StringBuilder_StringBuffer01 {

	public static void main(String[] args) {
		
		StringBuffer sbr1 = new StringBuffer(); // 16	
		System.out.println(sbr1.capacity());
		
		StringBuffer sbr2 = new StringBuffer("Java"); // 20
		System.out.println(sbr2.capacity());
		
		StringBuffer sbr3 = new StringBuffer(7); // 7	
		System.out.println(sbr3.capacity());
		
		sbr3.append("Java");
		System.out.println(sbr3.capacity()); // 7
		
		sbr3.append(" is good");
		System.out.println(sbr3.capacity()); // 7*2+2=16
		
	}

}
