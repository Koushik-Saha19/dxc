package com.dxc.PassengerMS.dao;

import java.util.ArrayList;
import java.util.List;


import com.dxc.PassengerMS.model.Passenger;

public class PassengerDAOImpl implements PassengerDAO {

	List<Passenger> allPassenger = new ArrayList<Passenger>();
	
	@Override
	public Passenger getPassengerDetails(int passengerPNR) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Passenger> getAllPassenger() {
		// TODO Auto-generated method stub
		return allPassenger;
	}

	@Override
	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub

		allPassenger.add(passenger);
	}

	@Override
	public Passenger deletePassenger(int passengerPNR) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updatePassenger(Passenger passenger) {
		// TODO Auto-generated method stub

	}

}
