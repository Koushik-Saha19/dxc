package com.dxc.PassengerMS.dao;

import java.util.List;
import com.dxc.PassengerMS.model.Passenger;


public interface PassengerDAO {

	public Passenger getPassengerByPNR(int passengerPNR);
	public List<Passenger> getAllPassenger();
	public void addPassenger(Passenger passenger);
	public Passenger deletePassenger(int passengerPNR);
	public void updatePassenger(Passenger passenger);
}
