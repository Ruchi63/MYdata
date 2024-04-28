package day6;

abstract class Animal
{
	abstract void sound();
}
 class Camel extends Animal
{

	@Override
	void sound() {
		System.out.println("grunt");
		
	}
}
class cat extends Animal
{

	@Override
	void sound() {
		System.out.println("meow");
		
	}
	
}
public class Demoabstraction {

	public static void main(String[] args) {
		// cat c=new  cat();
		//c.sound();//override
		//Camel c1=new Camel();
		//c1.sound();
		Animal a=new Camel();//abstraction
		a.sound();//no need of creation parent class object 
		Animal b=new cat();//
		b.sound();
		//In abstraction==>syntax of object creation
//parent class name object name=new (keyword) child class object

	}

}
