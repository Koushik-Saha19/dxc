package day4_Assignment;

public class Truck extends Vehicle {

	String fuel;
	 
	public Truck() {
		// TODO Auto-generated constructor stub
	}

	public Truck(int noOfTier, String typeOfVehicle, int priceOfVehicle, int engineCCofVehicle,String fuel) {
		super(noOfTier, typeOfVehicle, priceOfVehicle, engineCCofVehicle);
		// TODO Auto-generated constructor stub
		this.fuel = fuel;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	@Override
	public String toString() {
		return "Truck [fuel=" + fuel + ", " + super.toString() + "]";
	}

	
}
