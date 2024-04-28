package DemoOOPS;
class animal
{
	protected void sound()
	{
		System.out.println("showing protected");
	}
}
public class demoprotected {

	public static void main(String[] args) {
		 animal a=new  animal();
      a.sound();
	}

}
