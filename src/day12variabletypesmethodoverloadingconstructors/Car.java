package day12variabletypesmethodoverloadingconstructors;

	
/*
	 		1) Constructor is for creating object from a class
	 		2) Every class has default constructor, default constructors are invisible.
	 		3) When you create a constructor, Java removes the default constructor.
	 		4) How to create our own constructor
	 			i) Type Access Modifier make it "public" most of the times 	// public
	 			ii) Type class name											// car
	 			iii) Open-close parenthesis									// ()
	 			iv) Open close curly braces									// {}
	 		5) Default Constructor is like: "public Car() {}"
	 		6) Constructors do not have "return" type because of that constructors 
	 			are not methods. Constructors are constructors.
	 		7) Constructors names MUST MATCH with the Class Names
	 		
	 */


public class Car {
	
	String make;  //instance variable
	String model; 
	int price;
	int year;
	
	// Constructors can be overloaded as well, constructors are not methods, they don't have return type.
	
	public Car() {		
		this.make = "Honda";
		this.model = "Pilot";
		this.price = 40000;
		this.year = 2021;
	}
	
	public Car(String make, String model, int price, int year) {		
		this.make = make;
		this.model = model;
		this.price = price;
		this.year = year;
		
	}

	public static void main(String[] args) {
		

	}

}
