package day2;

public class DemoString {

	public static void main(String[] args) {
		String str="Java",str1="Hello";
		String str2="Hello in world of Java";
		//to print uppercase char
		System.out.println("upperCase==>"+str.toUpperCase());
		// to print lower case char
		System.out.println("LowerCase==>"+str.toLowerCase());
		
		// find the length of the string
		System.out.println("length==>"+str.length());
		//Concatenate two string
		System.out.println("Concat==>"+str1.concat(str));
		
		//if string is equal ...it return true otherwise return false
		System.out.println("Equals==>"+str.equals("JAVA"));
		// its ignore the upper case and lower case
		System.out.println("Equalsignorecase==>"+str.equalsIgnoreCase("JAVA"));
		// replace from old to new char
		System.out.println("Replace==>"+str1.replace("Hello", "c"));
		// print part of the string will show
		System.out.println("Substring==>"+str.substring(3));
		//if contains  return true otherwise false
		System.out.println("Contains==>"+str2.contains(str));

		System.out.println("charat==>"+str.charAt(3));
		
		//for reverse method we use string bufferclass
		StringBuffer sb=new StringBuffer("Welcome");
		System.out.println("Reverse==>"+sb.reverse());
	}

}
