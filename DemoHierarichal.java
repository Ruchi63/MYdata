package day4;

class Trainer//parent class
{
	public void teaching()
	{
		System.out.println("Teaching");
	}
}
class NewJoinee extends Trainer
{
	public void Upgrading()
    {
		System.out.println("upgrading");
	 }
	
}
class Students extends Trainer
{
	public void learning()
	{
		System.out.println("learning");
	}
	
}
public class DemoHierarichal {

	public static void main(String[] args) {
		Students s=new Students();
		s.learning();
		s.teaching();
		NewJoinee n=new NewJoinee();
		n.Upgrading();
		n.teaching();
	}

}
