import java.lang.*;
import java.io.*;

class Input2
{
	public static void main(String arg[])
	{		
		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);

		try
		{
			System.out.println("Enter your name");
			String name = bobj.readLine();	

			System.out.println("Your name is :"+name);
			
			System.out.println("Enter your age");
			int age = Integer.parseInt(bobj.readLine());
			System.out.println("Your age is :"+age);
		}
		catch(IOException obj)
		{
			System.out.println("Exception occurs");
		}
		finally		// finally is use to deallocate the resources 
		{
			iobj = null;		// NULL is a  macro in c++ and c 
			bobj = null;		// null is a key word in java 
		}
	}
}

