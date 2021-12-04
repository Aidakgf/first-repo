package carproject;

/*
 	Q1) Can we create instance variables in abstract class? Yes
 	Q2) Can we create concrete methods in abstract classes? Yes
 	Q3) Can we create objects from abstract classes? No. 
 		Because by objects we can reach methods and abstract methods do not have body, 
 		we get error.
 	Q4) Can we create constructors in abstract classes? Yes.
 	Q5) Constructors are to create objects. If we cannot create object from abstract class,
 		then what is the usage of constructors in abstract classes? 
 		i) to reach the instance variables of abstract class from concrete child classes
		ii) to assign values to instance variables using super constructor call with parameter
            when we create an object from concrete child class			
 		Static Block: i) It runs only once when the class is loaded into memory
                  ii) to initialize static variables
    
 	
 */

public abstract class Car {
	
	String make;
	String model;
	int year;
	double price;
	
	static {
		System.out.println("Car is on the way");
	}
	
	
	public Car() {
		//super();
	}
	
	
	public Car(String model, int year, double price) {
		// super(); we can remove it
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	abstract String carMake();
	abstract String carModel();
	abstract  int carYear();
	abstract double carPrice();
	

}
