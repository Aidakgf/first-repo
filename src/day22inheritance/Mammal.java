package day22inheritance;

public class Mammal extends Animal{
	
	public Mammal() {
		System.out.println("Mammal Constructor...");
	}
	
	public void giveBirth () {
		System.out.println("Mammals give birth...");
	}
	
	public void milkFeed() {
		System.out.println("Mammals feed their babies with milk...");
	}

}
