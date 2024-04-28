package firstDay;

import java.util.Scanner;

public class PersonalInfo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name, edu, add;
		System.out.println("Enter your name");
		name = sc.next();
		System.out.println("Enter your education");
		edu = sc.next();
		System.out.println("Enter your address");
		add=sc.next();
		System.out.println("Enter your age");
		int age = sc.nextInt();
		System.out.println(name);
		System.out.println(edu);
		System.out.println(add);
		System.out.println(age);
	}
}
