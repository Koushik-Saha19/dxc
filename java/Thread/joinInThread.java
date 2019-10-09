package Thread;

class MyThread extends Thread
{
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Thread 1");
			try
			{
				Thread.sleep(500);
			}
			catch(InterruptedException e){}
		}
	}
}
public class joinInThread
{
	public static void main(String a[]) throws InterruptedException
	{
		MyThread t=new MyThread();
		t.start();
		//we are the two threads 
		t.join();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread 1");
		}
	}
}
