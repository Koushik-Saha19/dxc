package com.dxc.PassengerMS.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.dxc.PassengerMS.dbcon.DBConnection;
import com.dxc.PassengerMS.model.Passenger;


public class PassengerDAOImpl implements PassengerDAO {

	Connection connection = DBConnection.getConnection();
	private static final String FETCH_PASSENGER_ALL = "select * from passenger";
	
	List<Passenger> allPassenger = new ArrayList<Passenger>();
	
	@Override
	public Passenger getPassengerByPNR(int passengerPNR) {
		Passenger passenger = allPassenger.stream().filter(n->n.getPassengerPNR()==passengerPNR).findFirst().get();
		return null;
	}

	@Override
	public List<Passenger> getAllPassenger() {
		List<Passenger> allPassenger = new ArrayList<Passenger>();
		try {
		Statement stat = connection.createStatement();
		ResultSet res = stat.executeQuery(FETCH_PASSENGER_ALL);
		while(res.next()) {
			Passenger passenger = new Passenger();
			passenger.setPassengerPNR(res.getInt(1));
			passenger.setPassengertName(res.getString(2));
			passenger.setSource(res.getString(3));
			passenger.setDestination(res.getString(4));
			passenger.setFare(5);
			allPassenger.add(passenger);
		}
		}catch(SQLException e){
			e.printStackTrace();
		}
		
		return allPassenger;
	}

	@Override
	public void addPassenger(Passenger passenger) {
		// TODO Auto-generated method stub

		try {
			PreparedStatement preparedStatement= connection.prepareStatement("insert into passenger values(?,?,?,?,?)");
			preparedStatement.setInt(1, passenger.getPassengerPNR());
			preparedStatement.setString(2,  passenger.getPassengertName());
			preparedStatement.setString(3, passenger.getSource());
			preparedStatement.setString(4, passenger.getDestination());
			preparedStatement.setInt(5, passenger.getFare());
			
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
