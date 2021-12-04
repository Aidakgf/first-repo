package day27exceptions;

public class Exception01 {

	public static void main(String[] args) {
		
		String s1 = "Aliye Can";
		String t1 = "ALi";
		divideLengths4(s1, t1);
		
		String s2 = "";
		String t2 = "ALi";
		divideLengths4(s2, t2);
		
		String s3 = "Aliye Can";
		String t3 = "";
		divideLengths4(s3, t3); // ArithmeticException
		
		String s4 = null;
		String t4 = "ALi";
		divideLengths4(s4, t4); // NullPointerException, if you use length() with "null" object, then you get this exception
		
		String s5 = "Aliye Can";
		String t5 = "ALi";
		divideLengths4(s5.substring(9), t5);
		
		String s6 = "Aliye Canan";
		String t6 = "ALi";
		divideLengths4(s6, t6); // StringIndexOutOfBoundsException
	
	
		
		
	}
	
	// Create a method to divide the lengths of 2 given Strings
	public static void divideLengths(String s, String t) {
		int result;
		try {
			if(s.equals("Aliye Canan")) {
				result = s.substring(12).length() / t.length();
			} else {
				result = s.length() / t.length();
			}
			System.out.println(result);
		
		
		} catch(ArithmeticException e) {
			System.out.println("do not divide by zero: " + e.getMessage());
		} catch(NullPointerException e) {
			System.out.println("null does not have length: " + e.getMessage());
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Do not use non-existing index of String:" + e.getMessage());
		}	
	}
	
	// can we catch all exceptions using a single exception?
	
	public static void divideLengths1(String s, String t) {
		int result;
		try {
			if(s.equals("Aliye Canan")) {
				result = s.substring(12).length() / t.length();
			} else {
				result = s.length() / t.length();
			}
			System.out.println(result);
		
		
		} catch(RuntimeException e) {
			System.out.println("There is an issue in try block: " + e.getMessage());
		} 		
	}
	
	// Create different logic for each exception
	
	public static void divideLengths2(String s, String t) {
		int result;
		try {
			if(s.equals("Aliye Canan")) {
				result = s.substring(12).length() / t.length();
			} else {
				result = s.length() / t.length();
			}
			System.out.println(result);
		
		
		} catch(ArithmeticException e) {
			result = -1;
			System.out.println(result);
		} catch(NullPointerException e) {
			result = -2;
			System.out.println(result);		
		} catch(StringIndexOutOfBoundsException e) {
			result = -3;
			System.out.println(result);
		}	
	}
	
	// Turn -2 for arithmetic exception , and -1 for other exceptions
	// If there are some exceptions which have parent-child relation, 
	// child class exception must be written first, at the top.
	public static void divideLengths3(String s, String t) {
		int result;
		try {
			if(s.equals("Aliye Canan")) {
				result = s.substring(12).length() / t.length();
			} else {
				result = s.length() / t.length();
			}
			System.out.println(result);
		
		
		} 
		catch(ArithmeticException e) {
			result = -2;
			System.out.println(result);
		} 		
		catch(Exception e) {
			result = -1;
			System.out.println(result);
		} 
	}
	
	// Type "Mission is completed" in any case
	// "Finally" block runs in any case after each structure
	// How can we handle exceptions? Note:
	// 	1) try + single catch
	//	2) try + multiple catch
	//	3) try + single catch + finally
	//	4) try + multiple catch + finally
	//	5) try + finally
	
	public static void divideLengths4(String s, String t) {
		int result;
		try {
			if(s.equals("Aliye Canan")) {
				result = s.substring(12).length() / t.length();
			} else {
				result = s.length() / t.length();
			}
			System.out.println(result);		
		
		} catch(ArithmeticException e) {
			System.out.println("do not divide by zero: " + e.getMessage());
			
		} catch(NullPointerException e) {
			System.out.println("null does not have length: " + e.getMessage());
			
		} catch(StringIndexOutOfBoundsException e) {
			System.out.println("Do not use non-existing index of String:" + e.getMessage());
			
		} finally {
			System.out.println("Mission is completed");
		}
	}
	
}
