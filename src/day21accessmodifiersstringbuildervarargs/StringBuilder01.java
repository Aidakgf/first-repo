package day21accessmodifiersstringbuildervarargs;

public class StringBuilder01 {

	public static void main(String[] args) {
		
		// String s = "Ali"; // normally we create String like this, since String is ummutable, you can't update existing String.
		
		// How to create StringBuilder object 
		// 1.Way:
		StringBuilder sb1 = new StringBuilder(); // Gives you empty String. Default capacity is 16.
		System.out.println("sb1 is :" + sb1); // sb1 is :
		
		System.out.println("sb1 length: " + sb1.length()); //sb1 length: 0
		
		System.out.println("sb1 capacity: " + sb1.capacity()); // sb1 capacity: 16 (default)
		sb1.append("sgfvhdfbvhfbkhjbhv");
		System.out.println("sb1 capacity: " + sb1.capacity()); // sb1 capacity: 34 ==> 16*2+2=34
		
		
		// ALthough, I didn't do assignment, original value of sb1 is updated to "Ali",
		// it means StringBuilder is MUTABLE like List
		sb1.append("Ali");
		System.out.println("sb1 is :" + sb1); // sb1 is :Ali
		
		sb1.append(" Can");
		System.out.println("sb1 is :" + sb1); // sb1 is :Ali Can
		
		sb1.append(", how").append(" are").append(" you?");
		System.out.println("sb1 is :" + sb1); // sb1 is :Ali Can, how are you?
		
		// 2.Way
		StringBuilder sb2 = new StringBuilder("Ali Can");
		System.out.println("sb2 is :" + sb2); // sb2 is :Ali Can
		
		//23 is coming from 16 + 7
		System.out.println("sb2 capacity: " + sb2.capacity()); // sb2 capacity: 23
		
		sb2.append(" went to school.");
		System.out.println("sb2 is : " + sb2); // sb2 is : Ali Can went to school.
		
		// 3.Way
		StringBuilder sb3 = new StringBuilder(9); // 9 is the capacity of the StringBuilder, five characters
		sb3.append("1234");
		System.out.println("sb3 is : " + sb3); // sb3 is : 1234
		
		sb3.append("56789");
		System.out.println("sb3 is : " + sb3); // sb3 is : 123456789
		
		System.out.println(sb3.capacity()); // 9 initial capacity
		
		sb3.append("Wooow!");
		System.out.println("sb3 is : " + sb3); // sb3 is : 123456789Wooow!
		
		System.out.println(sb3.capacity()); // 20 = 9*2+2
		
		
		
		

	}

}
