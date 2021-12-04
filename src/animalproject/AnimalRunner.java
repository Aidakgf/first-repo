package animalproject;

public class AnimalRunner {

	public static void main(String[] args) {
		
		System.out.println("=============ANIMAL1============");
		Animal animal1 = new Cat("Saruman", 5, "Home", true);
		System.out.println("Animal name: " + animal1.animalName());
		System.out.println("Animal age: " + animal1.animalAge());
		System.out.println("Animal habitat: " + animal1.habitat());
		System.out.println("Is animal Domestic? " + animal1.isDomestic());
		
		System.out.println("=============ANIMAL2============");
		Animal animal2 = new Eagle("Black", 75, "Mountain", false);
		System.out.println("Animal name: " + animal2.animalName());
		System.out.println("Animal age: " + animal2.animalAge());
		System.out.println("Animal habitat: " + animal2.habitat());
		System.out.println("Is animal Domestic? " + animal2.isDomestic());
		
		

	}

}
