package day4_Assignment;

public class Car extends Vehicle {

	int passengerCapacity;
    int noOfTier = 4;
	
	public Car() {
		super();
	}

	public Car(int noOfTier, String typeOfVehicle, int priceOfVehicle, int engineCCofVehicle, int passengerCapacity) {
		super(noOfTier, typeOfVehicle, priceOfVehicle, engineCCofVehicle);
		this.passengerCapacity = passengerCapacity;
	}

	public int getPassengerCapacity() {
		return passengerCapacity;
	}

	public void setPassengerCapacity(int passengerCapacity) {
		this.passengerCapacity = passengerCapacity;
	}

	@Override
	public String toString() {
		return "Car [passengerCapacity=" + passengerCapacity + ", " + super.toString() + "]";
	}
	
   
	
}
