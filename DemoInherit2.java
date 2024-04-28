package day4;
//single inheritance
class Employee
{ 
	int sal=20000;
		
}
class Tester extends Employee
{
	int bonus=1000;
}

public class DemoInherit2 {

	public static void main(String[] args) {
		Tester t=new Tester();
		System.out.println(t.sal);
		System.out.println(t.bonus);

	}

}
