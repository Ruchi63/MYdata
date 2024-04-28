package day6;
//overriding
class Shape
{
	void draw()
	{
		System.out.println("can be of any shape");
	}	
}
class Square extends Shape
{
	void draw() 
	{
		System.out.println("Square shape");
	}
}
public class DemoOverriding {
	public static void main(String[] args) {
		Shape s=new Shape();
		s.draw();
		Square s1=new Square();
		s1.draw();
		
	}
}
