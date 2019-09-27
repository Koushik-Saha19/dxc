package day3;

public class demo2 {
	
	String pnrNumber;
	String mobileNumber;
	String passengerName;
	int fare;
	int cgst=100;
	int sgst=100;
	
	public void bookTicket() {
		pnrNumber="15266278";
		mobileNumber="62621718189";
		passengerName="Joe";
		fare= 9800+cgst+sgst;
		System.out.println("Your Ticket is booked");
		System.out.println(mobileNumber + " is recorded too");
		System.out.println("Your total fair is " + fare);
	}
	
	public void cancelTicket() {
		pnrNumber="952669878";
		mobileNumber="54621718189";
		passengerName="Mak";
		fare= 8800+cgst+sgst;
		System.out.println("Your Ticket is canceled and return is initiated");
		System.out.println(mobileNumber + " is recorded too");
		System.out.println("Your total fair is " + fare);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo2 d2 = new demo2();
		d2.bookTicket();
		System.out.println(" ");
		d2.cancelTicket();

	}

}
