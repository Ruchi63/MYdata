package day6;

public class DemoPloymorphism {
	//method overloading
	void add() //non parameterised
	{
		int a=10,b=20;
		System.out.println("addition-->"+(a+b));
	}
	void add(int a,double b) 
	{
		double sum=a+b;
		System.out.println("Addition-->"+sum);
	}
	void add(double a,double b) 
	{
		double mul=a*b;
		System.out.println("multiplication-->"+mul);
	}

	public static void main(String[] args) {
		DemoPloymorphism d=new DemoPloymorphism();
		d.add();
		d.add(2, 5);
		d.add(2.3, 4.4);
	//Task==> find the area of circle,rectangle,triangle,square
	}

	}
