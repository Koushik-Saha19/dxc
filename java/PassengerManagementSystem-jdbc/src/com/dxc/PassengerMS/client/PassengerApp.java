package com.dxc.PassengerMS.client;

import java.util.Scanner;

import com.dxc.PassengerMS.dao.PassengerDAO;
import com.dxc.PassengerMS.dao.PassengerDAOImpl;
import com.dxc.PassengerMS.model.Passenger;

import com.dxc.PassengerMS.model.Passenger;

public class PassengerApp {

	PassengerDAO passengerDAO;
	int choice = 0;
	int passengerPNR;
	String passengerName;
	String source;
	String destination ;
	int fare;
	Scanner scanner = new Scanner(System.in);
	public  PassengerApp() {
		
			this.passengerDAO = new PassengerDAOImpl();//here object type is ProductDAO but it is referring to ProductDAOImpl class...
	}
	public void launchPassengerApp() {
	while(true) {
		System.out.println("MENU");
		System.out.println("1. Add passenger");
		System.out.println("2. Get All The passenger");
		System.out.println("3. Get passenger by PNR");
		System.out.println("4. Delete passenger by PNR");
		System.out.println("5. Update passenger by PNR");
		System.out.println("6. EXIT");
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your choice: (1-6)");
		
		choice = scanner.nextInt();
		
		switch (choice) {
		case 1:
			System.out.println("Please enter Passenger PNR");
			passengerPNR = scanner.nextInt();
			System.out.println("Please enter Passenger Name");
			 passengerName = scanner.next();
			System.out.println("Please enter Passenger source");
			 source = scanner.next();
			System.out.println("Please enter Passenger destination");
			 destination = scanner.next();
			System.out.println("Please enter Passenger fare");
			 fare = scanner.nextInt();
			
			Passenger passenger = new Passenger(passengerPNR, passengerName,source,destination,fare);
			
			passengerDAO.addPassenger(passenger);
					
			break;
		case 2:
			System.out.println(passengerDAO.getAllPassenger());
			break;
			
		case 3:
			System.out.println("please enter passengerPNR to search");
			passengerPNR = scanner.nextInt();
			Passenger searchpassenger = passengerDAO.getPassengerByPNR(passengerPNR);
			System.out.println(searchpassenger);
			break;
		case 4:
			System.out.println("please enter passengerPNR to delete");
			passengerPNR = scanner.nextInt();

			passengerDAO.deletePassenger(passengerPNR);
			System.out.println("Passenger deleted successfully");
			break;
		case 5:
			System.out.println("Wecome to update process");
			Passenger passengerToUpdate = takePassengerInput();
			passengerDAO.updatePassenger(passengerToUpdate);
			System.out.println("Your Passenger updated successfully");
			break;
		case 6:
			System.out.println("Thanks for using my app");
			System.exit(0);
		default:
			System.out.println("R U drunk milk. Please enter (1-6)");
		}
	}
}
	private Passenger takePassengerInput() {
		System.out.println("Please enter passengerPNR");
		passengerPNR = scanner.nextInt();
		System.out.println("Please enter passengerName");
		passengerName = scanner.next();
		System.out.println("Please enter source");
		source = scanner.next();
		System.out.println("Please enter destination");
		destination = scanner.next();
		System.out.println("Please enter fare");
		fare = scanner.nextInt();
		
		Passenger passenger = new Passenger(passengerPNR, passengerName,source,destination,fare);
		return passenger;
	}
}
