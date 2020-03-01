package testcases;

public class Swaptwointegerswithoutusingthirdvariable {

	public static void main(String[] args) {

		
		int x=5;
		
		int y= 10;
		
		//1. with using 3rd variable
		
		/* int t;
		
	    t =x;
	    
	    x=y; //10
	    
	    y = t; //5  */
	    
	    
	    //2. w/o using 3rd variable : using + operator
	    
	   /* x =x+y; //15
	    
	    y = x-y; // 5
	    
	    x = x-y;  // 10 */
	    
	    
		//3. w/o using 3rd variable : using * operator
	    
		
        x =x * y; // 50
	    
	    y = x/y; // 5
	    
	    x = x/y;  // 10
	    
	    
	    System.out.println(x);
	    
	    System.out.println(y);
		
	}

}
