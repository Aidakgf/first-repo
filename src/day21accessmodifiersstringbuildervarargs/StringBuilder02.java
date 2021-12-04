package day21accessmodifiersstringbuildervarargs;

public class StringBuilder02 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Pilot");
		StringBuilder sb2 = new StringBuilder("Kava");
		
		System.out.println(sb1.charAt(2)); // v
		
		// compareTo() compares the StringBuilders lexicographically.
		// "0" means completely same
		// "-" numbers mean first StringBuilder is before the second one in alphabetical order
		// "+" numbers mean first StringBuilder is after the second one in alphabetical order
		System.out.println(sb1.compareTo(sb2)); // -1
		
		sb1.delete(1, 3);
		System.out.println(sb1); //Pot
		
		sb2.deleteCharAt(3);
		System.out.println(sb2); // Kav
		
		System.out.println(sb2.equals(sb1)); // false
		
		System.out.println(sb2.indexOf("v", 1)); // 2
		
		// insert(2, "s"); it will insert "s" at index 2 without removing any character
		sb2.insert(2, "s");
		System.out.println(sb2); // Kasv
		
		// The greatest first parameter can be the length.
		// If you use number more than length in the first parameter you will get Run Time Error
		sb2.insert(4, "W");
		System.out.println(sb2); // KasvW
		
		sb2.insert(1, "XYZUVUSvhv", 2, 3);
		System.out.println(sb2); // KZasvW
		
		System.out.println(sb2.lastIndexOf("v")); // 4
		
		System.out.println(sb2.lastIndexOf("v",3));
		
		StringBuilder sb3 = new StringBuilder("hollo world hello");
		System.out.println(sb3.lastIndexOf("o", 6)); // 4
		
		sb3.replace(5, 6, "-");
		System.out.println(sb3); // hollo-world hello
		
		sb3.reverse();
		System.out.println(sb3); // olleh dlrow-olloh
		
		sb3.setCharAt(11, '!');
		System.out.println(sb3); // olleh dlrow!olloh

		System.out.println(sb3.subSequence(6, 11)); // dlrow ==> CharSequence object

		System.out.println(sb3.substring(6, 11)); // dlrow ==> String Object

		// toString() method converts "StringBuilder" to "String"
		String s1 = sb3.toString().replace("o", "*");
		System.out.println(s1);  // *lleh dlr*w!*ll*h
		
		sb3 = new StringBuilder(s1);
		System.out.println(sb3); // *lleh dlr*w!*ll*h
		
		sb3 = new StringBuilder(sb3.toString().replace("o", "*"));
		System.out.println(sb3); // *lleh dlr*w!*ll*h
		
	}

}
