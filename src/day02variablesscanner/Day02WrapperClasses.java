package day02variablesscanner;

public class Day02WrapperClasses {
	
	public static void main(String[] args) {
		
		boolean primitiveBoolean = true;
	
		Boolean nonPrimitiveBoolean = true;
		System.out.println(nonPrimitiveBoolean.equals(true)); //true
		System.out.println(nonPrimitiveBoolean.equals(false)); //false
		
		char c1 = 'A';
		
		Character c2 = 'A';
		System.out.println(c2.charValue()); //A
		
		byte b1 = 12;
		
		Byte b2 = 12;
		System.out.println(b2.MAX_VALUE);	//127
		System.out.println(b2.MIN_VALUE);	//-128
		
		short s1 = 123;
		
		Short s2 = 123;
		Short s3 = 120;
		System.out.println(s2.compareTo(s3)); // compareTo() method returns 0, if the numbers are equal to each other
											// s2.compareTo(s3) method returned -2 for 123 and 125, it means s2-s3
											// s2.compareTo(s3) method returned 3 for 123 and 120, it means s2-s3
		
		Integer i1 = 1234;
		System.out.println(i1.MIN_VALUE); //-2147483648
		
		Long l1 = 12345L;
		System.out.println(l1.BYTES); //8
		
		Float f1 = 1.34F;
		System.out.println(f1.BYTES); //32 bits = 4 bytes ==> 4
		
		Double d1 = 23.456;
		System.out.println(d1.MAX_VALUE); //1.7976931348623157E308 
		
		
		
		
		
		
		
		
		
		}

}
