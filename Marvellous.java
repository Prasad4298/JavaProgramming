import java.lang.*;

class Incapsulation
{
	public int i;
	public int j;

	public Incapsulation()
	{
		this.i = 0;
		this.j = 0;
	}

	public Incapsulation(int x, int y)
	{
		this.i = x;
		this.j = y;
	}

	public void Fun()
	{
		System.out.println("Inside Fun.....!");
	}

	public void Gun()
	{
		System.out.println("Inside Gun......!");
	}
}

class Marvellous
{
	public static void main(String arr[])
	{
		System.out.println("Inside main...!");

		Incapsulation obj = new Incapsulation();
		obj.Fun();
		obj.Gun();

		System.out.println(obj.i);

		Incapsulation objx = new Incapsulation(11,21);
		objx.Fun();
		objx.Gun();

		System.out.println(objx.i);
		System.out.println(objx.j);
	}
}
