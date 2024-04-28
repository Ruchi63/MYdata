package day2;

import java.util.Scanner;

public class DemoString2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter salary");
		int sal=sc.nextInt();
		System.out.println("Designation");
		String Desg=sc.next();
      if(sal>=40000 && Desg.equalsIgnoreCase("Manager"))
		{
			System.out.println("Bonus");
		}
		else 
		{
			System.out.println("no bonus");
		}

	}

}
