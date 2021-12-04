package day13statickeyword;

public class Cars {
	
	public String make;
	public String model;
	public int year;
	public int price;
	public int vin;
	public static int numOfCars;
	
	public Cars() {
		
	}
	
	public Cars(String make, String model, int year, int price) {
		this.make=make;
		this.model=model;
		this.year=year;
		this.price=price;
		numOfCars++;
	}
	
	
	//instance method
	public void drive() {
		System.out.println("I drive the car");
	}
	
	//static method
	public static String engine() {
		return "The car has engine";
	}
	
	public String createVin(Cars c) {
		String vin = c.make.substring(0, 3) + c.model.charAt(0) + c.year + numOfCars;
		return vin;
	}

}
