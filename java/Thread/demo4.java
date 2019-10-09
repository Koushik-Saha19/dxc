package Thread;
class PrintClass{
	public synchronized static void PrintName(String firstName,String lastName) {
		System.out.println("First Name: " + firstName);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("Last Name: " + lastName);
	}
}
public class demo4 extends Thread {
	Thread t1, t2;
	public demo4() {
		t1 = new Thread(this);t1.start();
		t2 = new Thread(this);t2.start();
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		PrintClass.PrintName("Joe", "Root");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new demo4();

	}

}
