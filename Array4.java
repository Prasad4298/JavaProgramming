import java.lang.*;
import java.util.*;

class Array3
{
	public static void main(String arg[])
	{
		// arr is 2 dimentional array which contains 2 one dimentional array 
		// each one diementional array contains 3 elements and 
		//each element is of type integer.

		int arr[][] = new int [2][];
		
		arr[0] = new arr[3];
		arr[1] = new arr[5];
		arr[2] = new arr[2];

		// nested loop
		for(i = 0; i < arr.length; i++)
		{
			for(j = 0; j < arr.length; j++)
			{
				System.out.println(arr[i][j]);
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
