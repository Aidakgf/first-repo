package carproject;

public class CarRunner {

	public static void main(String[] args) {
		
		System.out.println("=============CAR1============");
// DATA TYPE(REFERENCE TYPE)           OBJECT TYPE
		Car 				car1 = new Honda();
		System.out.println(car1.model); // null
		System.out.println(car1.carMake()); //Car make: Honda
		System.out.println(car1.carModel()); //Car model: Accord
		System.out.println(car1.carYear()); // 2012
		System.out.println(car1.carPrice()); // 8000.0
		
		
		System.out.println("=============CAR2============");
		Car car2 = new Honda("Civic", 2020, 20000);
		System.out.println(car2.model); // Civic
		System.out.println(car2.carMake()); // Car make: Honda
		System.out.println(car2.carModel()); // Car model: Civic
		System.out.println(car2.carYear()); // 2020
		System.out.println(car2.carPrice()); // 20000.0
		
		System.out.println("=============CAR3============");
		Car car3 = new Toyota();
		System.out.println(car3.carMake()); // Toyota
		System.out.println(car3.carModel()); // Camry
		System.out.println(car3.carYear()); // 2015
		System.out.println(car3.carPrice()); // 14000.0
		

	}

}
