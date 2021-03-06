package ArrayList;



public class Customer_Exercise {

	int custId;
	String custName;
	String custAddress;
	int billAmount;
	
	
	
	public Customer_Exercise() {
		 this.custId = 0;
		 this.custName = "Not available";
		 this.custAddress = "Not available";
		 this.billAmount = 100;
	}
   public Customer_Exercise( int custId,String custName,String custAddress,int billAmount) {
		 this.custId = custId;
		 this.custName = custName;
		 this.custAddress = custAddress;
		 this.billAmount = billAmount;
	   
	}


@Override
public String toString() {
	return "\nCustomer [custId=" + custId + ", custName=" + custName + ", custAddress=" + custAddress + ", billAmount="
			+ billAmount + "]";
}
public int getCustId() {
	return custId;
}
public void setCustId(int custId) {
	this.custId = custId;
}
public String getCustName() {
	return custName;
}
public void setCustName(String custName) {
	this.custName = custName;
}
public String getCustAddress() {
	return custAddress;
}
public void setCustAddress(String custAddress) {
	this.custAddress = custAddress;
}
public int getBillAmount() {
	return billAmount;
}
public void setBillAmount(int billAmount) {
	this.billAmount = billAmount;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + billAmount;
	result = prime * result + ((custAddress == null) ? 0 : custAddress.hashCode());
	result = prime * result + custId;
	result = prime * result + ((custName == null) ? 0 : custName.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Customer_Exercise other = (Customer_Exercise) obj;
	if (billAmount != other.billAmount)
		return false;
	if (custAddress == null) {
		if (other.custAddress != null)
			return false;
	} else if (!custAddress.equals(other.custAddress))
		return false;
	if (custId != other.custId)
		return false;
	if (custName == null) {
		if (other.custName != null)
			return false;
	} else if (!custName.equals(other.custName))
		return false;
	return true;
}
}