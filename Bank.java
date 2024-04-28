package day6;
abstract class ATM 
{
	abstract void deposit();
	abstract void withdraw();
	String nm="GS";int bal=30000;	
public void disbal() 
{
	System.out.println("name==>"+nm+"Balance==>"+bal);
}
}

public class Bank extends ATM {

	public static void main(String[] args) {
		
		ATM c=new Bank();
		c.deposit();
		c.withdraw();
		
	}		@Override
			void deposit() 
			{
				int a=200;
			 bal=bal+a;
			System.out.println("Deposit==>"+bal);
			}

			@Override
			void withdraw() 
			{    int b=100;
				bal=bal-b;
				System.out.println("Withdraw==>"+bal);	
			}
	
		

	}
	
	
	



