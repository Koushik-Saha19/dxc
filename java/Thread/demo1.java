package Thread;

public class demo1 extends Thread{

	Thread t1;
	public demo1() {
		t1 = new Thread(this);
		t1.start();//Only when we start any Thread ..then only it's birth takes place...only declaration & initialization does not make a working Thread
		System.out.println("CONS CALLED"+ Thread.currentThread().getName());
	}
	
	
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("RUN CALLED"+ Thread.currentThread().getName());
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new demo1();
		System.out.println("MAIN CALLED" + Thread.currentThread().getName());
	}

}
