package DemoOOPS;

import java.util.Scanner;

public class Demo1 {
	static int x=10;
	Scanner sc=new 	Scanner(System.in);
	int a=sc.nextInt();
	int b=sc.nextInt();
	
public void add()
 {
	int ad=a+b;//use instance varible
	System.out.println("addition==>"+ad);
 }
	
	public void sub() 
	{ 
		int d=30,f=20;
		int sb=d-f;//localvariable
		System.out.println("substraction==>"+sb);
	}
	public void multi() 
	{
		int mul=a*b;
		System.out.println("Multiplication==>"+mul);
	}

	public static void main(String[] args) {
		Demo1 obj=new Demo1();
		System.out.println("instance variable"+obj.a);
	System.out.println("satatic variavle"+x);
	obj.add();
	obj.sub();
	obj.multi();

	}	

}
