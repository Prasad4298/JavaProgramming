import java.lang.*;
import java.io.*;

class Input1
{
	public static void main(String arg[]) 
	{

		InputStreamReader iobj = new InputStreamReader(System.in);
		BufferedReader bobj = new BufferedReader(iobj);

		System.out.println("Enter Your name :");

		// code inside try block gets excecuted under observation of JVM.
		try		
		{
			String name = bobj.readLine();	// exception prone code : jane exceptin ye ahe asa syntax
		}
		catch(IOException obj)
		{}		//  inside this block is exception handler code.
		
		System.out.println("Your name is : +name");
	}
}