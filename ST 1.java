import java.lang.*;
import java.util.*;

class Student
{
	public int rno;
	public String name;
	public int marks;

	public Student(int a, String str, int b)
	{
		this.rno = a;
		this.name = str;
		this.marks = b;
	}

	public void Display()
	{
		System.out.println(" Roll no : "+ this.rno + " Name is :"+ this.name + " Marks is :"+ marks);
	}
}

class ST1
{
	public static void main(String arg[])
	{
		Stack<Student> obj = new Stack<Student>();

		Student S1 = new Student(11,"Amit",89);
		Student S2 = new Student(21,"pooja",93);
		Student S3 = new Student(51,"Rohit",80);
		Student S4 = new Student(101,"Sachin",97);

		obj.push(S1);
		obj.push(S2);
		obj.push(S3);
		obj.push(S4);

		Iterator iobj = obj.iterator();
		while(iobj.hasNext())
		{
			System.out.println(iobj.next());
		}

		System.out.println("Poped elemets are");

		int no = 0;
		no = obj.pop();
		
	}
}