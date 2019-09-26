package day2;
import java.util.Scanner;

public class demo6 {

	
	Scanner sc = new Scanner(System.in);
	int n1,n2;
	
	
	public void display() {
		System.out.println("Please enter your numbers:");
		
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n1 = n1 + n2;
		n2 = n1 - n2;
		n1 = n1 - n2;
		
		System.out.println("The swaped numbers are:" + n1+ " "+ n2);
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		demo6 d6 = new demo6();
		d6.display();
	}

}
