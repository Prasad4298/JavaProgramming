import java.lang.*;
import java.util.*;

class Exception4
{
	public static void main(String a[])
	{
		int Arr[] = {10,20,30,40,50};		// without new word out memory allocated in heap 

		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the index");

		int index = sobj.nextInt();
		
		try
		{
			System.out.println("Inside try");
			System.out.println("Element at that index is :"+Arr[index]);
		}
		catch(ArrayIndexOutOfBoundsException obj)
		{
			System.out.println("Inside catch");
			System.out.println(obj);
		}
		catch(Exception obj)
		{
			System.out.println(obj);
		}
		finally
		{
			System.out.println("Inside finally");
			sobj.close();
		}
		System.out.println("End the Application");
	}
}

/*

OUTPUT

Enter the index
0
Element at that index is : 10

Enter the index
1
Element at that index is : 20

Enter the index
2
Element at that index is : 30

Enter the index
3
Element at that index is : 40 

Enter the index
4
Element at that index is : 50

Enter the index
5
Element at that index is :

*/
