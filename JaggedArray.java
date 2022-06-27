// in jagged array Fixed number of Rows But,number of column in each Row is differ
import java.lang.*;
import java.util.*;

class JaggedArray
{
	public static void main(String arg[]) 
	{
		int i = 0, j = 0;

		int Arr[][] = new int [3][];
		// their is fixed number of Rows i.e. 3
		// their is number of column in each Row is not Fixed.

		Arr[0] = new int [3];
		Arr[1] = new int [5];
		Arr[2] = new int [2];

		for(i = 0; i < Arr.length ; i++)
		{
			for(j = 0; j < Arr[i].length; j++)
			{
				System.out.println(Arr[i][j]);
			}
		}
	}
}