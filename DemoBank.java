package DemoOOPS;

abstract class ATM
{
	abstract void withdraw();
	abstract void diposit();
	public void disbal()
	{
	String nm="RS"; int bal=30000;
		System.out.println("balance is"+bal);
	}
	
}


public class DemoBank extends ATM{

	public static void main(String[] args) {
		 ATM a=new DemoBank();
		 a.disbal();
		 a.withdraw();
		 a.diposit();
		
		

	}

	@Override
	void withdraw()
	{
		
		int w=100;
		int bal=30000;
	 
	 bal=bal-w;
	 System.out.println("deduction amount"+bal);
		
	}

	@Override
	void diposit() {
		

		int w=100;
		int bal=30000;
	 
	 bal=bal+w;
	 System.out.println("total amount"+bal);
	}

}
