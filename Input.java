import java.util.*;
// import java.util.Scanner;

class Input
{
	public static void main(String a[])
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter your name");
		String name = sobj.nextLine();
		
		System.out.println("Enter your age");
		int Age = sobj.nextInt();
		
		System.out.println("Enter your percentage");
		float percentage = sobj.nextFloat();
		
		System.out.println("Your name is :"+name);
		System.out.println("Your Age is :"+Age);
		System.out.println("Your percentage is :"+percentage);
		
		
		//sobj.close();
		
		
	}
}