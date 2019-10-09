package com.cms.dxc.client;//this kind package name can be anything...here it is a arbitrary name..

import com.cms.dxc.exception.InvalidBillException;
import com.cms.dxc.model.Customer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(args[0]);...here have set parameters in the String[] args array...that's we are able to print...
		//System.out.println(args[1]);....to set parameter we just right clicked 
		Customer customer = null;
		try {
			customer = new Customer(101, "Joe", "Pune", -9800);
		} catch (InvalidBillException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		System.out.println(customer);
	}

}
