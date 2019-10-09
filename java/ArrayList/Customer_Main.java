package ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;

public class Customer_Main {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Customer_Exercise customer1 = new Customer_Exercise(1, "Joe", "London", 67);
		Customer_Exercise customer2 = new Customer_Exercise(2, "Jason", "England", 567);
		Customer_Exercise customer3 = new Customer_Exercise(3, "Eoin", "Ireland", 97);
		Customer_Exercise customer4 = new Customer_Exercise(4, "Stokes", "India", 797);
		Customer_Exercise customer5 = new Customer_Exercise(5, "Jony", "Delhi", 697);
		
		
		List<Customer_Exercise> customers = new ArrayList<Customer_Exercise>();
		
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		
//		Customer_Exercise customer1 = new Customer_Exercise(1, "Joe", "London", 67);
//		Customer_Exercise customer2 = new Customer_Exercise(2, "Jason", "England", 567);
//		Customer_Exercise customer3 = new Customer_Exercise(3, "Eoin", "Ireland", 97);
//		Customer_Exercise customer4 = new Customer_Exercise(4, "Stokes", "India", 797);
//		Customer_Exercise customer5 = new Customer_Exercise(5, "Jony", "Delhi", 697);
//		
//		
//		List<Customer_Exercise> customers = new ArrayList<Customer_Exercise>();
//		
//		customers.add(customer1);
//		customers.add(customer2);
//		customers.add(customer3);
//		customers.add(customer4);
//		customers.add(customer5);
		
		System.out.println("Before Sorting");
		System.out.println(customers);
		
		//Collections.sort(customers);
		System.out.println("After Sorting");
		System.out.println(customers);
		
		
	}

}
