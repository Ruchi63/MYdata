package day5;

   class A
 {
	public void methodpublic()
	{
		System.out.println("showing public method");
	}
	protected void methodprotected()
	{
		System.out.println("showing protected");
	}
 }
class B
	{
	private void methodprivate()
	{
	
		System.out.println("showing private method");
		
	}
	}//  B b=new B();

public class DemoEncapsulation {
	public void methodpublic1() 
	{
		System.out.println("showing public method 2");
	
	}
	protected void methodprotected2() 
	{
		System.out.println("showing protected method 3");
	}

	public static void main(String[] args) {
		A a=new A();
        a.methodprotected();
       a.methodpublic();
      
       
        
      
      
	}

}
