package day4;

class parent
{
	public void teaching() 
	{
		System.out.println("teaching");
	}		
}
class Child extends parent
{
	public void learning()
	{
		System.out.println("Learning");
	}
}
public class Demoinherit3 {
public static void main(String[] args) {
		Child c=new Child();
		c.teaching();
		c.learning();
		
	}

}
