import java.lang.*;

// final characteristics and its initializationin 2 ways 

class Demo
{
	public int i;
	public final int j = 20;// hard coded		// 1) he chalte initialization at the time of declaration in java
	public final int k;
	
	public Demo()	// public demo():j(20)  he c++
	{
		this.i = 10; 
		this.k = 30;		// 2) java madhe he chalte constructor madhe initialization
	}
	
	public Demo(int a, int b)  // ithe jar demo(int i, int k) ithe doni argumentchi nav same ahe characteristics
	{
		this.i = a;   // i = i;  he asa kel tar compiller kasa kalel ki konta i characteristics ahe te 
		this.k = b;
	}
	
	public void Fun()
	{
		i++;		//A
//		j++;        NA
//		k++;		NA 
	}
}

class Final1
{
	public static void main(String arg[]);
	{
		Demo obj1 = new Demo();
		obj1.Fun();
		System.out.println(obj1.i);
		System.out.println(obj1.j);
		System.out.println(obj1.k);
		
		Demo obj2 = new Demo(11,21);
		obj2.Fun();
		System.out.println(obj2.i);
		System.out.println(obj2.j);
		System.out.println(obj2.k);
	}
}