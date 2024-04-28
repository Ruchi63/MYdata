package firstDay;

import java.util.Scanner;

public class NumberComparision {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number");
	int a = sc.nextInt();
	
	if(a==10) {
		System.out.println("Wrong data");
	}
	else {
		System.out.println("Entered number is "+a);
		if(a==1) {
			System.out.println("One");
		}
		else if(a==2) {
			System.out.println("Two");
		}
	}
	}

}
