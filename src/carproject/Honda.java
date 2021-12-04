package carproject;

public class Honda extends Car{
	
	String make = "Honda";
	String model = "Accord";
	int year = 2012;
	double price = 8000;
	
	static{
		System.out.println("Honda is on the way");
	}
		
	
	//Source => Generate Constructor using fields => deselect all => generate
	public Honda() {
		// super(); we can clean super(), as it always exists
	}
	
	
	public Honda(String model, int year, double price) {
		super(model, year, price);
		this.model = model;
		this.year = year;
		this.price = price;
	}


	@Override
	String carMake() {
		return "Car make: " + this.make;
	}
	@Override
	String carModel() {
		return "Car model: " + this.model;
	}
	@Override
	int carYear() {
		return this.year;
	}
	@Override
	double carPrice() {
		return this.price;
	}

}
