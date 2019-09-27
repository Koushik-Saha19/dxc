package day3;

import java.util.Scanner;

public class demo1 {

	Scanner sc = new Scanner(System.in);
	int num;
	int sum = 0;
	int choice = 0;
	int count = 0;

	// num1 & num2 are instance variable,in java instead of calling global variable
	// they are said instance variable
	public void display() {
		do {
			System.out.println("please enter your number (between 0 to 100) ");
			num = sc.nextInt();
			if (num < 0) {
				System.out.println("Negatives are not allowed");
				continue;

			}
			if (num > 100) {
				System.out.println("number greater than 100 is not allowed");
				continue;
			}
			count++;
			sum += num;

			System.out.println("Do u want to continue?(enter 1 to continue and any number except 1 to exit)");
			choice = sc.nextInt();
			System.out.println("Your sum is:" + sum + " and current count is " + count);
		} while (choice == 1);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo1 d1 = new demo1();
		d1.display();//here display() is a constructor...it is created by default,when we initialize any object...
		System.out.println("Thanks for using our program");
	}

}
