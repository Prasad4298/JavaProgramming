import java.io.*;

class StringX
{
	public static void main(String arg[])
	{	
		// String literal 				// Memory for String literal pool
		String str1 = "Hello";
		String str2 = "World";

		System.out.println(str1); 		// Hello
		System.out.println(str1.length()); 		// 5		//length he method aahe 

		String str3 = str1 + str2;		// + Operator is use to perform concrate
		System.out.println(str3);
		String str4 = "Hello";


		// String objects		// dynamic aahe mhanun memory in heap section
		String str4 = new String("Hello");
		String str5 = new String("World");
		String str6 = new String("Hello");
	}
}

