package Thread;
//here in this program we are doing multiple thread
public class demo2 {

	Thread t1,t2;
	
	public demo2() {
		t1 = new Thread(new Music());
		t1.setName(" 1 ");//By this we are changing the name of the Thread
		t1.start();
		t2 = new Thread(new Score());
		t2.setName(" 2 ");//By this we are changing the name of the Thread
		t2.start();
		System.out.println("CONS CALLED" + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Thread tt = Thread.currentThread();
		tt.setName(" BOSS");
		new demo2();
		System.out.println("MAIN CALLED" + Thread.currentThread().getName());
	}
	

}
class Music extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("MUSIC RUN CALLED BY" + Thread.currentThread().getName());
	}
	
}

class Score extends Thread{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("SCORE RUN CALLED BY" + Thread.currentThread().getName());
	}
	
}
