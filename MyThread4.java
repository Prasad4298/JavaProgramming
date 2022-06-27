import java.lang.*;

class MyThread4
{
	public static void main(String arg[])
	{	
		Marvellous mobj1 = new Marvellous();
		Thread t1 = new Thread(mobj1,"First");

		Marvellous mobj2 = new Marvellous();
		Thread t2 = new Thread(mobj2,"Second");

		t1.start();
		t2.start();

	}
}

class Marvellous implements Runnable
{
	public void run()
	{
		System.out.println("Name of current thread is :"+tobj.getName());
		for(int i = 0; i <= 1000; i++)
		{
			System.out.println("Thread Scheduled :"+Thread.currentThread().getName()+":"+i);
		}
	}
}

