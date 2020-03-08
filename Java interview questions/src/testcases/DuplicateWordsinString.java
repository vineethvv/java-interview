package testcases;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWordsinString {
	
	// Hey java is java best language is java 
	//java - 3
	//is -2

	public static void main(String[] args) {

		findDuplicatewords("Hey java is java best language is java is");
		
	}
	
	public static void findDuplicatewords(String inputstring) {
		
		// split
		
		String words[]= inputstring.split(" ");
		
		// create one hash map
		
		Map<String, Integer> wordcount = new HashMap<String, Integer>();
		
		// To check each word in given array ie words
		
		for ( String word : words) {
			
			
			// if word is present in the array
			
			if(wordcount.containsKey(word)) {
				
				wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
			}
			
			else {
				
				wordcount.put(word, 1);
			}
		}
	
	// extracting all the keys of map wordcount
		
		Set<String> wordsinstring = wordcount.keySet();
		
		// loop through all the words in wordcount
		
		for( String word : wordsinstring) {
			
			
			if (wordcount.get(word)>1) {
				
				System.out.println(word+" : " + wordcount.get(word));
			}
		}
	}
	

}
