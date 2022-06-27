import java.lang.*;

class Marvellous implements Runnable
{
	public void run()
	{
		System.out.println("Name of current thread is :"+tobj.getName());
	}
}

class MyThread3
{
	public static void main(String arg[])
	{	
		Marvellous mobj1 = new Marvellous();
		Thread t1 = new Thread(mobj);
	}
}

