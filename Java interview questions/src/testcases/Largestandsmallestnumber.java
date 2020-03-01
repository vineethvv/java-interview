package testcases;

import java.util.Arrays;

public class Largestandsmallestnumber {

	public static void main(String[] args) {
		
		int numbers[] = {-10, 24, 50, -88, 987456};
		
		int largest = numbers[0];
		
		int smallest = numbers[0];
		
		for (int i=1; i<numbers.length; i++) {
			
			
			if (numbers[i]>largest) {
				
				largest = numbers[i]; //987456
			}
			
			else if(numbers[i]<smallest){
				
				smallest = numbers[i]; //-88
			}
		}
		
		
		System.out.println("\n given array is ::" + Arrays.toString(numbers));
		
		System.out.println("largest num is ::"+ largest );
		
		System.out.println("smallest num is ::" + smallest);
		

	}

}
