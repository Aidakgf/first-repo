package day25abstractclassinterface;

public abstract class ElectricalVehicles implements AirCondition, HybridEngine{

	@Override
	public void climateAc() {
		System.out.println("The electrical vehicle climate AC...");
		
	}

	@Override
	public void run() {
		System.out.println("Electrical vehicle is the best...");
		
	}

	//@Override
	// public abstract void electronicAc();

}
