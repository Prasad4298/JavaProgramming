import java.lang.*;
import java.util.*;

class Array
{
	public static void main(String arg[]) 
	{
		int iCnt = 0;
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter number of elements");
		int iSize = sobj.nextInt();
		int Arr[] = new int [iSize];

		System.out.println("The size of Array is "+Arr.length);
		System.out.println("Enter the elements of Array");

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
		System.out.println("elements in Array are");

		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}