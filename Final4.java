import java.lang.*;

final class Base 
{
	public void fun()
	{
		Sytem.out.println("Base fun");
	}
}

class Derived 	
{
	public Base bobj = new Base();			// Composition
	
	public void gun()
	{
		Sytem.out.println("Derived fun");
	}
}

class Final4		
{
	public static void main(String a[])
	{
		Derived dobj = new Derived();
		dobj.bobj.fun();
		dobj.gun();
	}
}


/*

java.lang

final class System
{
	public static PrintStream out = new PrintStream
	
}

class PrintStream 
{
	public void println(String str)
	{
		
	}
}

System.out.println("Hello...");

*/





