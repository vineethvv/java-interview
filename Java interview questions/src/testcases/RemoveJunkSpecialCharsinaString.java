package testcases;

public class RemoveJunkSpecialCharsinaString {

	public static void main(String[] args) {
		
		
		String s =  "#$%^&*@! learning %^&*() selenium java";
		
		String s1 = "464644 framework";
		
		// Regular expression -- [^a-zA-Z0-9]
		
		s = s.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(s);
		
		
		s1= s1.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(s1);

	}

}
