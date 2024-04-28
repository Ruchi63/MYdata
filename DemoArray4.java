package day1;

import java.util.Scanner;

public class DemoArray4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int n=sc.nextInt();
		System.out.println("enter the elements of array");
		int arr[]=new int[n];
		for (int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
			//System.out.println(arr[i]);
		} 
		
		System.out.println("display");
		for(int i=0;i<n;i++)
		{
			
			System.out.println(arr[i]);
		}

	}

}
