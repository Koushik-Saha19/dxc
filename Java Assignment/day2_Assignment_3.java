package day2;

import java.util.Scanner;

public class day2_Assignment_3 {

	
	Scanner sc = new Scanner(System.in);
	int yr;
	
	
	public void display() {
		System.out.println("Please enter your year:");
		
		yr = sc.nextInt();
		
		if(yr%4==0) {
		System.out.println("Your entered year is leap year");
		}
		else {
			System.out.println("Your entered year is not a leap year");
		}
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		day2_Assignment_3 d7 = new day2_Assignment_3();
		d7.display();
	}

}
