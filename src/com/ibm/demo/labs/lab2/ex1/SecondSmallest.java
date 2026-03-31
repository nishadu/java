package com.ibm.demo.labs.lab2.ex1;

import java.util.Arrays;

public class SecondSmallest {
	
	int getSecondSmallest(int[] arr) {
		
		//sort the array
		Arrays.sort(arr);
		
		// return second smallest element
		return arr[1];
	}

}
