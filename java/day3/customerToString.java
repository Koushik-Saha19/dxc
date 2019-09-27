package day3;

public class customerToString {

	int custId;
	String custName;
	String custAddress;
	int billAmount;

	public customerToString() {
		this.custId = 0;
		this.custName = "Not available";
		this.custAddress = "Not available";
		this.billAmount = 100;
	}

	public customerToString(int custId, String custName, String custAddress, int billAmount) {
		this.custId = custId;
		this.custName = custName;
		this.custAddress = custAddress;
		this.billAmount = billAmount;

	}

//	public void display() {
//		System.out.println("Customer Id is: " + custId);
//		System.out.println("Customer Name is: " + custName);
//		System.out.println("Customer Address is: " + custAddress);
//		System.out.println("Customer BillAmount is: " + billAmount);
//	}

	// This is a Accessor..
	public String GetCustAddress() {
		return custAddress;
	}

	// This is a Accessor..
	public int getCustId() {
		return custId;
	}

	// This is a Accessor..
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}

	// This is a Mutator..
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}

	// This is a Mutator..
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		customerToString cust1 = new customerToString(1, "Neha", "Delhi", 900);
		customerToString cust2 = new customerToString(2, "Rekha", "Delhi", 8900);
		customerToString cust3 = new customerToString();// here is every case customer() is a
																		// constructor
		customerToString cust4 = new customerToString(4, "Jaya", "Mumbai", 800);
		customerToString cust5 = new customerToString();

		cust1.setCustName("Ram");
		cust2.setBillAmount(598);
		cust4.setCustAddress("USA");
		
		System.out.println(cust1);
		
		cust1.GetCustAddress();
		cust2.getCustId();
		cust3.getCustName();
		
		
		

	}

	@Override
	public String toString() {
		return " [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress
				+ ", billAmount=" + billAmount + "]";
	}

	// This is a Mutator..
	
}
