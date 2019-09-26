package day2;
import java.util.Scanner;

public class demo5 {

	
	Scanner sc = new Scanner(System.in);
	char ch;
	
	public void display() {
		System.out.println("Please enter your charater:");
		ch = sc.next().charAt(0);
		
		if(ch=='a' || ch=='e'|| ch=='i'|| ch=='o'|| ch=='u' ) {
			
			System.out.println("Your character is a vowel");
		}
		else {
			System.out.println("Your character is not a vowel");
		}
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo5 d5 = new demo5();
		d5.display();
	}

}