package _01_Searching_Algorithms;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class _04_SearchTest {

	// A MINIMUM OF 3 TESTS ARE REQUIRED FOR EACH METHOD
	
	@Test
	public void testLinearSearch() {
		//1. use the assertEquals method to test your linear search method.
		String[] arr= new String[5];
		arr[0]="s";
		arr[1]="SDDD";
		arr[2]="SDF";
		arr[3]="dff";
		arr[4]="DSF";
		
		 assertEquals(_00_LinearSearch.linearSearch(arr, "DSF"), 4);
		
	}

	@Test
	public void testBinarySearch() {
		//2. use the assertEquals method to test your binary search method.
		//   remember that the array must be sorted
		int[] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=5;
		arr[3]=100;
		arr[4]=340;
		
		 assertEquals( _01_BinarySearch.binarySearch(arr,0,4, 100), 3);
	
	}
	
	@Test
	public void testInterpolationSearch() {
		//3. use the assertEquals method to test your interpolation search method.
		//   remember that the array must be sorted and evenly distributed
		int[] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=5;
		arr[3]=100;
		arr[4]=340;
		assertEquals(_02_InterpolationSearch.interpolationSearch(arr,100), 3);
	}
	
	@Test
	public void testExponentialSearch() {
		//4. use the assertEquals method to test your exponential search method.
		//   remember that the array must be sorted
		int[] arr= new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=5;
		arr[3]=100;
		arr[4]=340;
		assertEquals(_03_ExponentialSearch.exponentialSearch(arr,100), 3);
	}
}
