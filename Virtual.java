import java.lang.*;

class Base 
{
	public int i,j;
	
	// virtual public void fun() 
	public void fun()		// defination   
	{ System.out.println("Base fun"); }
	
	public void gun()		// defination
	{ System.out.println("Base gun"); }
	
	public void sun()		// defination
	{ System.out.println("Base sun"); }
}

class Derived extends Base 
{
	public int x,y;
	
	public void fun()		// Overriding 
	{ System.out.println("Derived fun"); }
	
	public void sun()		// Overriding 
	{ System.out.println("Derived sun"); }
	
	public void run()		// defination
	{ System.out.println("Derived run"); }
}

class Virtual
{
	public static void main(String arg[])	
	{
		//Base bobj = new Base();		// no casting
		//Derived dobj = new Derived (); 	// no casting
		
		Base obj1 = new Derived();		// upcasting		Base *bp = new Derived()
		//Derived obj2 = new Base();		// downcasting
		
		obj.fun();		 // Derived fun     bp -> fun()
		obj.gun();		// Base gun
		obj.sun();		// Derived sun
		//obj.run();		// error
	}
}