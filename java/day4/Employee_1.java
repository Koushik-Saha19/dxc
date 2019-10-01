package day4;

public class Employee_1 {

	private int employeeId;
	private String employeeName;
	
	public Employee_1() {
		
	}

	public Employee_1(int employeeId, String employeeName) {
		super();//this is always called ..if we don't write it then also it is called 
		this.employeeId = employeeId;
		this.employeeName = employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + "]";
	}
	
	
}
