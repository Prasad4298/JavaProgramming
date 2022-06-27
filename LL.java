import java.lang.*;
import java.util.*;

class LL
{
	public static void main(String arg[])
	{
		LinkedList <String> obj = new LinkedList<String>();
		obj.add("January");
		obj.add("Marvellous");
		obj.add("February");
		obj.add("March");
		obj.add("Marvellous");
		obj.add("April");
		obj.add("Marvellous");
		obj.add("Marvellous");
		obj.add("Marvellous");


		obj.add(2,"New");

		System.out.println("ArrayList contains :"+obj);
		System.out.println("Size is : "+obj.size());

		System.out.println("Elements are using for loop :");
		int i = 0;

		for( i = 0; i < obj.size(); i++)
		{
			System.out.println(obj.get(i));
		}

		String str;
		int Cnt = 0;

		for( i = 0; i < obj.size(); i++)
		{
			str = obj.get(i);
			if(str.equals("Marvellous"))
			{
				Cnt++;
			}		
		}

		System.out.println("The number of Marvellous String in array is :"+Cnt);


		if(obj.contains("April"))
		{
			System.out.println("April Element is there");
		}

		int ret = obj.indexOf("April");
		System.out.println("Element April is at index : "+ret);

		System.out.println("Element at index :"+obj.get(3));

		obj.remove(2);
		System.out.println("Updated List is: "+obj);

		obj.remove("April");
		System.out.println("Updated List is: "+obj);

		// he is automatic concept imagination
		Iterator iobj = obj.iterator();		// Iterator is class and iterator is method
		while(iobj.hasNext())	// has next method return value is boolean
		{
			System.out.println(iobj.next());
		}

		obj.clear();
		System.out.println("Updated List is: "+obj);


	}
}