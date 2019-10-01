package day4;

public class RegularEmployee extends Employee_1 {

	
	private int  RegularEmployeeId;
	private int RegularEmployeeSalary;
	public RegularEmployee() {
		// TODO Auto-generated constructor stub
	}
	public RegularEmployee(int regularEmployeeId, int regularEmployeeSalary) {
		super();
		RegularEmployeeId = regularEmployeeId;
		RegularEmployeeSalary = regularEmployeeSalary;
	}
	public int getRegularEmployeeId() {
		return RegularEmployeeId;
	}
	public void setRegularEmployeeId(int regularEmployeeId) {
		RegularEmployeeId = regularEmployeeId;
	}
	public int getRegularEmployeeSalary() {
		return RegularEmployeeSalary;
	}
	public void setRegularEmployeeSalary(int regularEmployeeSalary) {
		RegularEmployeeSalary = regularEmployeeSalary;
	}
	@Override
	public String toString() {
		return "RegularEmployee [RegularEmployeeId=" + RegularEmployeeId + ", RegularEmployeeSalary="
				+ RegularEmployeeSalary + ", getRegularEmployeeId()=" + getRegularEmployeeId()
				+ ", getRegularEmployeeSalary()=" + getRegularEmployeeSalary() + "]";
	}
	

}
