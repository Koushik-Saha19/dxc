package day2;

import java.util.Scanner;

public class demo4 {

	
	Scanner sc = new Scanner(System.in);
	int num1;
	int num2;
	//num1 & num2 are instance variable,in java instead of calling global variable they are said instance variable
	public void display() {
		System.out.println("Please enter num1:");
		num1 = sc.nextInt();
		
		System.out.println("Please enter num2");
		num2 = sc.nextInt();
		
		
		System.out.println("Yourresult is:" + (num1 + num2));
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo4 d4 = new demo4();
		d4.display();
	}

}

