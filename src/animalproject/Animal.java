package animalproject;

public abstract class Animal {
	
	String name;
	int age;
	String habitat;
	boolean isDomestic;
	
	public Animal() {
		//super();
	}
	
	public Animal(String name, int age, String habitat, boolean isDomestic) {
		//super();
		this.name = name;
		this.age = age;
		this.habitat = habitat;
		this.isDomestic = isDomestic;
	}

	abstract String animalName();
	abstract int animalAge();
	abstract String habitat();
	abstract boolean isDomestic();
	
	

}
