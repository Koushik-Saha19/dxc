package day2;

import java.util.Scanner;

public class day2_Assignment_4 {

	Scanner sc = new Scanner(System.in);
	int num1;
	int num2;
	// num1 & num2 are instance variable,in java instead of calling global variable
	// they are said instance variable

	public void display() {
		System.out.println("Please enter num1:");
		num1 = sc.nextInt();

		System.out.println("Please enter num2");
		num2 = sc.nextInt();
		
		if(num1<0 || num2<0) {
			System.out.println("Sorry, we don't add negatives");
		}
		else {
		System.out.println("Your result is:" + (num1 + num2));
	}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		day2_Assignment_4 d8 = new day2_Assignment_4();
		d8.display();
	}

}
