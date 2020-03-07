package testcases;

public class FinalizeConcept {
	
	//finalize is a method
	
	// The purpose of finalize is : just before the garbage collector autumatically the finalize method will be called for the clean up process of object.
	
	public void finalize(){
		System.out.println("finalize method");
	}
	
	

	public static void main(String[] args) {
    
		// finalize keyword is used to perform the clean up process
		
		FinalizeConcept f1 = new FinalizeConcept();
		FinalizeConcept f2 = new FinalizeConcept();
		
		f1 = null;
		f2 = null;
		
		System.gc();
	}

}
