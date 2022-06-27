import java.lang.*;
import java.util.*;

class Array3
{
	public static void main(String arg[])
	{
		// arr is 2 dimentional array which contains 2 one dimentional array 
		// each one diementional array contains 3 elements and 
		//each element is of type integer.

		int arr[][] = new int [2][3];
		
		arr[0][0] = 11;
		arr[0][1] = 21;
		arr[0][2] = 51;
		arr[1][0] = 101;
		arr[1][1] = 111;
		arr[1][2] = 121;

		int i = 0;

		// nested loop
		// arr
		for(i = 0; i < arr.length; i++)
		{
			for(i = 0; i < arr.length; i++)
			{
				System.out.println(arr[i][i]);
			}
		}

	}
}

/*

OUTPUT

11
21
51
101
111
121


*/
