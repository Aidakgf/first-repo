package carproject;

public class Toyota extends Car {
	
	String make="Toyota";
    String model="Camry";
    int year=2015;
    double price=14000;
    
    
    public Toyota() {
        }
    
    public Toyota(String model, int year, double price) {
        super(model, year, price);
        this.model = model;
        this.year = year;
        this.price = price;
    }
    @Override
    String carMake() {
        return this.make;
    }
    @Override
    String carModel() {
        return this.model;
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