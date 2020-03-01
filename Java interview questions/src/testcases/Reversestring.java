package testcases;

public class Reversestring {

	public static void main(String[] args) {
	
		// Diferrence b/w string & string buffer
		
		// String is immutable & here we dont have any reverse function
		
		// String buffer is mutable & here we have reverse function
		
		
		String s = "selenium";
		
		
		//1. using for loop
		
		int length = s.length();
		
		String rev = "";
		
		for(int i = length-1; i>=0; i-- ) {
			
			rev = rev + s.charAt(i);
		}
		
		System.out.println(rev);
		
		//2. using StringBuffer class
		
		StringBuffer sf = new StringBuffer(s);
		
		System.out.println(sf.reverse());
		
	}

}
