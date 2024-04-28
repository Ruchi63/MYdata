package DemoOOPS;



public class MethodVariation {


	public void add(int a) 
	{
		a=30;
		int b=20;
		int sum=a+b;
		System.out.println("addition==>"+sum);
	}
	public void add(int a,double b) 
	{
		//a=30;
		
		double sum=a+b;
		System.out.println("addition==>"+sum);
	}
	
	public void sub(int a,int b)//two parameters 
	{
		//a=30;
		
		 int sub=a-b;
		System.out.println("substraction==>"+sub);
	}

	public static void main(String[] args) {
		MethodVariation mv=new MethodVariation();
		mv.add(10);
		mv.add(10, 10.4);
		mv.sub(10, 5);
		 animal a=new  animal();
	      //a.sound();
	    
	}
	
}
