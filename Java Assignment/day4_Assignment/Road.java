package day4_Assignment;

public class Road {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Truck T = new Truck(6,"CarryingCar",1000000,1000,"Diesel");
		System.out.println(T);
		System.out.println("\n");
		
		Bus B = new Bus(8,"ManyPassengerCarryingCar", 900000, 9500, 30);
		System.out.println(B);
		System.out.println("\n");
		
		Car C = new Car(4,"FamilyCar",600000,2500,5);
		System.out.println(C);
		System.out.println("\n");
	}

}
