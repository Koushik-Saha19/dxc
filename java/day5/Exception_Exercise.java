package day5;

public class Exception_Exercise {

	public void display() {
		System.out.println("Display Started");
		
		try {
			System.out.println("Ball");
			int mark[] = new int[-5];
			System.out.println("CAT");
			System.out.println(mark[6]);
			System.out.println("DOG");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("Array can't be negative");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array can't be accessed beyond it's length");
		}
		//try & catch is used to 
		System.out.println("Display Ended");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Started");
		Exception_Exercise d = new Exception_Exercise();
		d.display();
		System.out.println("MAIN ENDED");
		
	}

}
