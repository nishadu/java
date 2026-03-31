package com.ibm.demo.labs.lab2.ex2;

import java.util.Arrays;

public class StringSorter {
	String[] sortStrings(String[] arr) {

        // Step 1: Sort array
        Arrays.sort(arr);

        int n = arr.length;

        // Step 2: Find middle index
        int mid = (n + 1) / 2; // ensures extra goes to left if odd

        // Step 3: Convert cases
        for (int i = 0; i < n; i++) {
            if (i < mid) {
                arr[i] = arr[i].toUpperCase();
            } else {
                arr[i] = arr[i].toLowerCase();
            }
        }

        return arr;
    }

}
