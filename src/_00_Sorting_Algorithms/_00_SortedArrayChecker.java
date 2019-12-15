package _00_Sorting_Algorithms;

public class _00_SortedArrayChecker {
	//1. Write a static method called intArraySorted. 
	
	public static boolean intArraySorted(int[] array) {
	//   This method takes in an array of integers
		//   and it returns a boolean.
		//   The method returns true if the integer
		//   array is in ascending order and false otherwise
		boolean x= true;
		for(int i=0; i<array.length-1; i++) {
			if(array[i]<=array[i+1]) {
				
			}
			else {
				x=false;
			}
		}
		return x;
	}
	public static boolean doubleArraySorted(double[] array) {
		boolean x= true;
		for(int i=0; i<array.length-1; i++) {
			if(array[i]<=array[i+1]) {
				
			}
			else {
				x=false;
			}
		}
		return x;
		
		//2. Write a static method called doubleArraySorted. 
		//   This method takes in an array of doubles
		//   and it returns a boolean.
		//   The method returns true if the double
		//   array is in ascending order and false otherwise

	
	}
	
	public static boolean charArraySorted(char[] array) {
		//3. Write a static method called charArraySorted. 
		//   This method takes in an array of characters
		//   and it returns a boolean.
		//   The method returns true if the character
		//   array is in alphabetical order and false otherwise
		//   (You can compare characters just like integers)
		boolean x= true;
		for(int i=0; i<array.length-1; i++) {
			if((int)array[i]<=(int) array[i+1]) {
				
			}
			else {
				x=false;
			}
		}
		return x;
		
	}
	public static boolean stringArraySorted(String[] array) {
		//4. Write a static method called stringArraySorted. 
		//   This method takes in an array of Strings
		//   and it returns a boolean.
		//   The method returns true if the String
		//   array is in alphabetical order and false otherwise
		//   (Use the compareTo(String) method)
		
		boolean x= true;
		for(int i=0; i<array.length-1; i++) {
			if(array[i].compareTo(array[i+1])<=0) {
				
			}
			else {
				x=false;
			}
		}
		return x;
		
	}
	

	
	
	
	

	
	

}
