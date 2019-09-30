package day4_Assignment;

public class Vehicle {

	public int noOfTier;
	public String typeOfVehicle;
	public int priceOfVehicle;
	public int engineCCofVehicle;
	
	public void details(int noOfTier) {
		this.noOfTier = noOfTier;
	}
	public Vehicle() {
		
	}

	public Vehicle(int noOfTier, String typeOfVehicle, int priceOfVehicle, int engineCCofVehicle) {
		super();
		this.noOfTier = noOfTier;
		this.typeOfVehicle = typeOfVehicle;
		this.priceOfVehicle = priceOfVehicle;
		this.engineCCofVehicle = engineCCofVehicle;
	}

	public int getNoOfTier() {
		return noOfTier;
	}

	public void setNoOfTier(int noOfTier) {
		this.noOfTier = noOfTier;
	}

	public String getTypeOfVehicle() {
		return typeOfVehicle;
	}

	public void setTypeOfVehicle(String typeOfVehicle) {
		this.typeOfVehicle = typeOfVehicle;
	}

	public int getPriceOfVehicle() {
		return priceOfVehicle;
	}

	public void setPriceOfVehicle(int priceOfVehicle) {
		this.priceOfVehicle = priceOfVehicle;
	}

	public int getEngineCCofVehicle() {
		return engineCCofVehicle;
	}

	public void setEngineCCofVehicle(int engineCCofVehicle) {
		this.engineCCofVehicle = engineCCofVehicle;
	}

	@Override
	public String toString() {
		return "Vehicle [noOfTier=" + noOfTier + ", typeOfVehicle=" + typeOfVehicle + ", priceOfVehicle="
				+ priceOfVehicle + ", engineCCofVehicle=" + engineCCofVehicle + "]";
	}
	
	
	
}
