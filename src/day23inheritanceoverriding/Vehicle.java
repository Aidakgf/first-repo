package day23inheritanceoverriding;

/*
 	1) 	Multiple inherintance: A child class can't have multiple parents,
 		Java doesn't support.
 	2)	Hierarchical Inheritance: Parent may have multiple child classes,
 		Java supports this.
 	3)	Multi level Inheritance: Child --> Parent --> Grandparent
 		Java supports this.
 	4)	IS-A Relation: it is child-parent relation
 		Dog IS-A Animal
 	5)	HAS-A relation: It is parent-child relation
 		Animal HAS-A Mammal
 		
 */

public class Vehicle {

	public final move() {
		System.out.println("Vehicles move...");
	}
	
	public int price() {
		return 10000;
	}
	
	public Integer age() {
		return 0;
	}
	
	public Vehicle name() {
		return new Vehicle();
	}

}
