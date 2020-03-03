package testcases;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {

		String names[] = {"java", "javascript", "ruby", "c", "python", "java"};
		
		//1. compare each element
		
		for(int i=0; i<names.length; i++) {
			
			for (int j=i+1; j<names.length; j++) {
				
				if(names[i].equals(names[j])) {
					
					System.out.println("Duplicate element is " + names[i]);
				}
			}
		}
		
		
		//2. Using Hashset-- Hashset is a java collection, it stores only unique values
		
		Set<String> store = new HashSet<String>();
		
		for(String name : names) {
			
			if(store.add(name)== false) {
				
				System.out.println("Duplicate element is :" + name);
			}
		}
		
	}

}
