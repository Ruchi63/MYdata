package day6;

abstract  class IRCTC
{
	 abstract void availableseats();
}

class Searchseats extends IRCTC
{
			@Override
			void availableseats()
			{
			System.out.println("search seats if available");	
				
			}
			
		}

class Booktickets extends IRCTC
{
@Override
	void availableseats() 
	{
		System.out.println(" book tickets");
	}
}

public class DemoIRCTC {

	public static void main(String[] args) {
		IRCTC c=new Searchseats();
		c.availableseats();
		IRCTC d=new Booktickets();
		d.availableseats();
	}

}
