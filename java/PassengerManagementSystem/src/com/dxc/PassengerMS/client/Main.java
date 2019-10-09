package com.dxc.PassengerMS.client;

import java.util.Scanner;
import com.dxc.PassengerMS.model.Passenger;

import com.dxc.PassengerMS.dao.PassengerDAO;
import com.dxc.PassengerMS.dao.PassengerDAOImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassengerDAO passengerDAO = new PassengerDAOImpl();
		
		while(true) {
			System.out.println("MENU");
			System.out.println("1. Add the Passenger Detail");
			System.out.println("2. Get All The Passenger");
			System.out.println("3. Exit");
			Scanner scanner = new Scanner(System.in);
			int choice = 0;
			System.out.println("Please enter your choice: (1-3)");
			
			choice = scanner.nextInt();
			
			switch (choice) {
			case 1:
				System.out.println("Please enter Passenger PNR");
				int passengerPNR = scanner.nextInt();
				System.out.println("Please enter Passenger Name");
				String passengerName = scanner.next();
				System.out.println("Please enter Passenger source");
				String source = scanner.next();
				System.out.println("Please enter Passenger destination");
				String destination = scanner.next();
				System.out.println("Please enter Passenger fare");
				int fare = scanner.nextInt();
				
				Passenger passenger = new Passenger(passengerPNR, passengerName,source,destination,fare);
				
				passengerDAO.addPassenger(passenger);
						
				break;
			case 2:
				System.out.println(passengerDAO.getAllPassenger());
				break;
				
			case 3:
				System.out.println("Thanks for using my app");
				System.exit(0);
			default:
				System.out.println("R U Okay. Please enter (1-3)");
			}
		}
	}
	}


