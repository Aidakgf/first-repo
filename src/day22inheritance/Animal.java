package day22inheritance;

/*
 	Parent-Child Classes relations (Inheritance)
 	1) Public class members can be used in child class
 	2) Protected class members can be used in child class 
 	3) Default class members can be used in child class
 		Parent-child classes must be in the same package
 	4) Private class members canNOT be used in child class
 	5) Static class members should be accessed by child class name (not dog1, but Dog)
 	6) Java does not support multiple inheritance,
 		a class can have only one parent class
 	7) super() is parent constructor call
 	8) super() must be in the first line in every constructor
 	9) this() must be in the first line as well,
 		we cannot use this() and super() in the same constructor
 	
 	
 	
 */

public class Animal {
	
	public Animal() {
		System.out.println("Animal constructor...");
	}
	
	int age;
	
	public void eat () {
		System.out.println("Animal eat...");
	}
	
	public void drink () {
		System.out.println("Animals drink...");
	}

}
