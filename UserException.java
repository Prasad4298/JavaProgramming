// in jagged array Fixed number of Rows But,number of column in each Row is differ
import java.lang.*;
import java.util.*;
import java.lang.Exception;

class AgeInvalid extends Exception
{
	public AgeInvalid(String str) 
	{
		super(str);
	}
}

class UserException
{
	public static void main(String arg[]) 
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sobj.nextInt();

		try
		{
			if(age < 18)
			{
				throw new AgeInvalid("Age is below 18");
			}
		}
		catch(AgeInvalid obj)
		{
			System.out.println("Inside Catch");
			System.out.println(obj);
		}
	}
}