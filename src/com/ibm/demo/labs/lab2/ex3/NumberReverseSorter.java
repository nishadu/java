package com.ibm.demo.labs.lab2.ex3;

import java.util.Arrays;

public class NumberReverseSorter {
	 int[] getSorted(int[] arr) {

	        int[] result = new int[arr.length];

	        // Step 1: Reverse each number
	        for (int i = 0; i < arr.length; i++) {
	            String str = Integer.toString(arr[i]);
	            String reversed = new StringBuilder(str).reverse().toString();
	            result[i] = Integer.parseInt(reversed);
	        }

	        // Step 2: Sort the array
	        Arrays.sort(result);

	        return result;
	    }

}
