package testcases;

public class CheckIsNumeric {

	public static void main(String[] args) {

		// Check whether the String contains only digit characters
		
		String str = "j4564";
		
	      System.out.println("String: "+str);
	      
	      if(str.matches("[0-9]+")) {
	    	  
	         System.out.println("String contains only digits!");
	         
	      } else {
	    	  
	         System.out.println("String contains digits as well as other characters!");
	      }
		
	}

}
