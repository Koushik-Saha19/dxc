package Thread;

public class demo3 extends Thread{

	public demo3(int i) {
		setName(i+" ");
		Thread.currentThread().setName("M");
		
		if(i==3) {
			setPriority(10);
			
		}
		start();
			
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
			
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("RUN CALLED " + Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=3; i++) {
			new demo3(i);
		}
		System.out.println("MAIN CALLED BY " + Thread.currentThread().getName());
	}

}
