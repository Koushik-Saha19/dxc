package day5;

interface A{
	int marks = 90;
	void display1();
	static void myDD() {
		System.out.println("My static method of interface");
	}
	default void myDefaultMethod() {
		System.out.println("My default method of interface");
	}
}
interface B extends A{
	void display2();
	default void display1(){
		
	}
}
abstract class DD implements B{
	
}
class MyLastClass extends DD{

	@Override
	public void display2() {
		// TODO Auto-generated method stub
		
	}
	
}


public class interface_Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyLastClass a = new MyLastClass();
		A.myDD();
	}

}

