import java.io.*;

class Wrapper
{
	public static void main(String arg[])
	{		
		int no = 11;

		Integer iobj = new Integer(11);

		int i = iobj;		// Unboxing 

		Integer iobj2 = no;		// boxing

		System.out.println(no);
		System.out.println(iobj);
		System.out.println(i);
		System.out.println(iobj2);
	}
}

