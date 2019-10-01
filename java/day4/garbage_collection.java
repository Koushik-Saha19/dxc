package day4;

class Employee{
	int salary;
	public void finalize() {
		System.out.println("Employee object reclaimed--FINALIZE called");
	}
}





public class garbage_collection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee_1 e1 = new Employee_1();
		Employee_1 e2 = new Employee_1();
		System.out.println("Employee object is created");
		e1 = e2;
		
		System.gc();
	}

}
