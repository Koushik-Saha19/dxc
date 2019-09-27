package day3;

public class customer {

	int custId;
	String custName;
	String custAddress;
	int billAmount;
	
	
	public customer() {
		 this.custId = 0;
		 this.custName = "Not available";
		 this.custAddress = "Not available";
		 this.billAmount = 100;
	}
   public customer( int custId,String custName,String custAddress,int billAmount) {
		 this.custId = custId;
		 this.custName = custName;
		 this.custAddress = custAddress;
		 this.billAmount = billAmount;
	   
	}
 
public void display() {
		System.out.println("Customer Id is: " + custId);
		System.out.println("Customer Name is: " + custName);
		System.out.println("Customer Address is: " + custAddress);
		System.out.println("Customer Billamount is: " + billAmount);
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customer cust1 = new customer(1,"Neha","Delhi",900);
		customer cust2 = new customer(2,"Rekha","Delhi",8900);
		customer cust3 = new customer();//here is every case customer() is a constructer
		customer cust4 = new customer(4,"Jaya","Mumbai",800);
		customer cust5 = new customer();
		
		cust1.display();
		cust2.display();
		cust3.display();
		cust4.display();
		cust5.display();
		
	}
	

}
