package day5;

import java.util.Scanner;

class Salary
{
	private int sal=13000,ta,da,pf;
	Scanner sc=new Scanner(System.in);
	
	protected void calSalary() 
	{
		System.out.println("Enter choice==>Hr---1 and other0");
		int ch=sc.nextInt();
		if(ch==1) 
		{
			System.out.println("salary of hr--1"+(sal+ta+da+pf));
		}
		else 
		{
			System.out.println("salary of other==>"+(sal+pf));
		}
	}
public void otherbenifit() 
{
	System.out.println("entere values");
	int ta=sc.nextInt();
	System.out.println("ta");
	int da=sc.nextInt();
	System.out.println("da");
	int pf=sc.nextInt();
	System.out.println("pf");
	
}
}
public class DemoEncapsu3 {

	public static void main(String[] args) {
		Salary s=new Salary();
		//s.calSalary();
		s.otherbenifit();
		s.calSalary();
	}
}

