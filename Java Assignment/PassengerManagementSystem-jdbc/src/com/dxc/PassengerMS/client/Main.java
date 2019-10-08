package com.dxc.PassengerMS.client;

import java.util.Scanner;
import com.dxc.PassengerMS.model.Passenger;
import com.dxc.PassengerMS.client.PassengerApp;
import com.dxc.PassengerMS.dao.PassengerDAO;
import com.dxc.PassengerMS.dao.PassengerDAOImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PassengerDAO passengerDAO = new PassengerDAOImpl();
		
		PassengerApp app = new PassengerApp();
		app.launchPassengerApp();
	}
	}


