package testcases;

public class Reverseinteger {

	public static void main(String[] args) {
	
		
		//1. using algorithm
		
		long num = 12345;  // declaration
		
		long rev =0;
		
		while(num !=0) {
			
  			rev = rev * 10 + num % 10; 
			
			num = num / 10;			
			
		}
		
		System.out.println(rev);
		
		

	}

}
