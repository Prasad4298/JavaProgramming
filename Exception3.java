import java.lang.*;
import java.util.*;

class Exception3
{
	public static void main(String a[])
	{
		int Arr[] = {10,20,30,40,50};		// without new word out memory allocated in heap 

		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter the index");

		int index = sobj.nextInt();
		
		System.out.println("Element at that index is :"+Arr[index]);
	}
}

/*

OUTPUT

Enter the index
0
Element at that index is :

Enter the index
1
Element at that index is :

Enter the index
2
Element at that index is :

Enter the index
3
Element at that index is :

Enter the index
4
Element at that index is :

Enter the index
5
Element at that index is :

*/
