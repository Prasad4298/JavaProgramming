import java.lang.*;

class Demo extends Thread
{
	public void run()		// Running state
	{
		for(int i = 0; i < 10; i++)
		{
			System.out.println("Value of i :"+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception obj)
			{}
		}
	}
}

class MyThread5
{
	public static void main(String ar[])
	{
		Demo obj1 = new Demo();
		Thread t1 = new Thread(obj1,"First");		// New state

		Demo obj2 = new Demo();
		Thread t2 = new Thread(obj2,"Second");		// New state

		t1.start();		// Runnable state
		t2.start();		// Runnable state		
		// Dead state
	}
}


// run method is call back method
// in this code their are 2 Thread ( 1st is mean and 2nd is we created)