Import java.lang.*;

abstract class RBI
{
	public int Balance;
	
	public RBI()
	{
		this.Balance = 0;
	}
	
	public void Credit(int Amount)
	{
		this.Balance = this.Balance + Amount;
	}
	
	public void Debit(int Amount)
	{
		this.Balance = this.Balance - Amount;
	}
	
	public abstract int Calculate_Intrest();
}

class SBI extends RBI 	
{
	public int Account_Number;
	public int IFSC;
	
	public int Calculate_Intrest()
	{
		return 6;
	}
}

class PNB extends RBI 	
{
	public int Account_Number;
	public int IFSC;
	
	public int Calculate_Intrest()
	{
		return 7;
	}
}

class AbstractDemo		
{
	public static void main(String a[])
	{
		PNB pobj = new PNB();
		SBI sobj = new SBI();
		
		pobj.Credit(1000);
		pobj.Debit(200);
		
		System.out.println(pobj.Balance);
	}
}

