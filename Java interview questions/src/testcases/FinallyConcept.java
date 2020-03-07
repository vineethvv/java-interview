package testcases;

public class FinallyConcept {

	public static void main(String[] args) {

		//test1();
		
		//test2();
		
		division();
		
	}

		//finally is a block
		
		public static void test1(){
			try{
				System.out.println("inside test1 method");
				throw new RuntimeException("test");
				
			}catch(Exception e){
				System.out.println("inside catch block");
			}
			
			finally
			{
				System.out.println("inside finally block"); // What ever the code which we written inside the finally block it will be executed
			}
		}
		
		public static void test2(){
			try{
				System.out.println("inside test2");
			}
			finally{
				System.out.println("finally code in test2 method");
			}
		}
		
		public static void division(){
			int i = 10;
			try{
				System.out.println("inside try block");
				int k = i/0;   // here it will throw an Arithemetic exception
			}
			catch(NullPointerException  e){
				System.out.println("Inside catch block");
				System.out.println("divide by zero error");
			}
			
			finally{
				System.out.println("execute this code even after any exception");
			}
		
	}
		
}
	

