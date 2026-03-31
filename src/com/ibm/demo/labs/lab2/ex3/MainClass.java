package com.ibm.demo.labs.lab2.ex3;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NumberReverseSorter obj = new NumberReverseSorter();

        int[] arr = {12, 45, 87, 10};

        int[] result = obj.getSorted(arr);

        System.out.println("Resulting array:");

        for (int num : result) {
            System.out.print(num + " ");
        }

	}

}
