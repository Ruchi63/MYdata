package DemoOOPS;



class teacher//parent class
{
	 
	public void teaching()
	{
		System.out.println("teaching us");
	}
}
 class  newjoinee //parent class
 {
 	 
 	public void newjoinee()
 	{
 		System.out.println("joining us");
 	}
 }
 
 class student extends teacher
{
	public void learning() 
	{
		System.out.println("we are learning");
	}
}
 
public class singleinh {

	public static void main(String[] args) {
		//teacher t=new teacher();
		student s=new student();//we are creating child class object
		s.teaching();
		s.learning();
		MethodVariation mv=new MethodVariation();
		mv.add(10);

	}

}
