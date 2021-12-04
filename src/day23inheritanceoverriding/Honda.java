package day23inheritanceoverriding;

/*
 	1)	Method Overriding: If child class uses a method from parent class
 		by changing the method body (implementation), it is called method overriding.
 		
 	2)	Overriding method: The method in Parent class
 	
 	3) 	Overridden method: The method in Child class
 	
 	4)	The access modifier of overridden method must be same as the access modifier
 		of overriding method or wider than the access modifier of overridden method
 		i) Overriding method: public --> Overridden method: public
 		ii) Overriding method: protected --> Overridden method: protected, public
 		iii) Overriding method: default --> Overridden method: default, protected, public
 		
 	5)	Private methods can't be overridden
 	
 	6)	If return type of overriding method is void, then the return type of
 		overridden method must be void
 		
 	7) 	If return type of overriding method is primitive (i.e. int), then the return type of
 		overridden method must be same primitive data type (i.e. int)
 		
 	8)	If return type of overriding method is wrapper class, then the return type of
 		overridden method must be same wrapper class
 		
 	9)	If return type of overriding method is non-primitive (Vehicle), then the return type of
 		overridden method must be same or the child class return type (Honda)
 		
 	10)	Static method can't be overridden
 	
 	11)	"final" keyword:
 		i)	"final methods" can't be overridden. Final method means "the method body can't be changed"
 			so we can't override it.
 		ii)	"final variable" can't be updated
 		iii) "final class" can't be Parent class. Final class can't have child class.
 		iv) "finalize" is the process the garbage collector applies and deletes object from
 			memory, garbage collector constantly scans memory and destroys the useless data.
 			
 			
 	
 	
 	
 	
 */

public class Honda extends Car{
	
	public void hybridEngine() {
		System.out.println("Honda had hybrid engine option...");
	}

	@Override
	public void move() {
		
		//super.move(); //parent constructor move
		
		System.out.println("Honda moves fast...");
	}

	@Override
	public int price() {		
		return 40000;
	}

	@Override
	public Integer age() {	
		return 2;
	}

	@Override
	public Honda name() {
		return new Honda();
	}
	
	

}
