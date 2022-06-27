import java.lang.*;
import java.util.*;

class MultiDArray
{
	public static void main(String arg[]) 
	{
		int i = 0, j = 0;

		int Arr[][] = new int [2][3];
		// arr is two dimentional array which contains 2 one dimentional array 
		// each one dimentional array contains 3 elements and each elements is of the type integer	

		Arr[0][0] = 11;
		Arr[0][1] = 21;
		Arr[0][2] = 51;
		Arr[1][0] = 101;
		Arr[1][1] = 111;
		Arr[1][2] = 121;

		System.out.println("arr.length :"+ Arr.length);		
		System.out.println("arr.[0].length :"+Arr[0].length);	
		System.out.println("arr.[1].length :"+Arr[1].length);	

		for(i = 0; i < Arr.length ; i++)
		{
			for(j = 0; j < Arr[i].length; j++)
			{
				System.out.println(Arr[i][j]);
			}
		}
	}
}