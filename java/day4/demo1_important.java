package day4;

public class demo1_important {

	
	for_demo1 w = new for_demo1();
	{
		System.out.println("Instance block");
	}
	
	static {
		System.out.println("Static block");
	}
	public demo1_important() {
		System.out.println("I am constructor");
	}
	
	

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("In main");
		new demo1_important();
		new demo1_important();
	}

}
