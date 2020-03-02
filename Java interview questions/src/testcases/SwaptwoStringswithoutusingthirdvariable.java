package testcases;

public class SwaptwoStringswithoutusingthirdvariable {

	public static void main(String[] args) {

		
		
		String a = "Hello";
		
		String b = "World";
		
		System.out.println("Before swapping :");
		
		System.out.println("value of a is :" + a);
		
		System.out.println("value of b is :" + b);
		
		
		//1. Append a & b
		
		a = a+b; // HelloWorld
		
		//2. store initial string a in string b
		
		b = a.substring(0, a.length()-b.length());
		
		
		//3. store initial string b in string a
		
		a = a.substring(b.length());
		
        System.out.println("After swapping :");
		
		System.out.println("value of a is :" + a);
		
		System.out.println("value of b is :" + b);
		
	}

}
