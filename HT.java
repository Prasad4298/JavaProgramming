import java.lang.*;
import java.util.*;

class HT
{
	public static void main(String arg[])
	{
		// Integer is key
		// String is value

		Hashtable <Integer,String> obj = new Hashtable <Integer,String> ();

		obj.put(11,"Amit");
		obj.put(21,"Prasad");
		obj.put(22,"Mayur");
		obj.put(30,"Sagar");
		obj.put(34,"Dinesh");

		System.out.println(obj.get(11));
		System.out.println("Paduka aalya......"+obj.get(21));

		System.out.println("Data from Hash table");
		Enumeration eobj = obj.keys();

		while(eobj.hasMoreElements())	// this method return boolean
		{
			System.out.println(eobj.nextElement());
		}

	}
}

// hash table is not stored value in sequencial formate.