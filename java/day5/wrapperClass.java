package day5;

public class wrapperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String mark = "90";
		int i = Integer.parseInt(mark);//Integer is a class and parseInt() is a static method of Integer class
		System.out.println(i+5);
		
		int p = 80;
		 Integer p1 = new Integer(p);
		 
		 //unboxing
		 int k = p1.intValue();
		 
		 //auto unboxing
		 int k1 = p1;
		  
		 //auto boxing
		 Integer pp = k1;
	}

}
