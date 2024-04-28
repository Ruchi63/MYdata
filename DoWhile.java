package demo1;
import java.util.Scanner;
public class DoWhile {
	public static void main(String[] args) {
		  int num, sum = 0;
	      Scanner sc = new Scanner(System.in);
	      do {
	    	 System.out.print("Enter a number: ");
	    	 num = sc.nextInt();
	    	 sum =sum+ num;
	      } while (num != 0);		   
	      System.out.println("Sum = " + sum);
	      System.out.println("Out of the loop \n Byeeeee");
	      sc.close();
	}
}