package day4_Assignment;

public class Bus extends Vehicle {

	int noOfPassenger;
	 
	

	

	public Bus(int noOfTier, String typeOfVehicle, int priceOfVehicle, int engineCCofVehicle,int noOfPassenger) {
		// TODO Auto-generated constructor stub
		super(noOfTier, typeOfVehicle, priceOfVehicle, engineCCofVehicle);
		this.noOfPassenger = noOfPassenger;
	}

	public int getNoOfPassenger() {
		return noOfPassenger;
	}

	public void setNoOfPassenger(int noOfPassenger) {
		this.noOfPassenger = noOfPassenger;
	}

	@Override
	public String toString() {
		return "Bus [noOfPassenger=" + noOfPassenger + ", " + super.toString() + "]";
	}
	

}
