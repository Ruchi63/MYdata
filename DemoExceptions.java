package DemoOOPS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class DemoExceptions {

	public static void main(String[] args) throws Exception {
		try 
		{ 
			int a=10,b=0;
			int c=a/b;// logical error
			System.out.println("answer is==>"+c);
			
		}
		catch (Exception e) 
		{
			System.out.println("not divisible");
			Thread.sleep(2000);//wait for 2 second
			FileInputStream fis=new FileInputStream("home/luser/desktops");
			
		
	}

}
}
