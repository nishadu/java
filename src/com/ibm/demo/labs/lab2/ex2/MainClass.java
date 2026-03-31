package com.ibm.demo.labs.lab2.ex2;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringSorter obj = new StringSorter();

        String[] arr = {"apple", "Banana", "mango", "Cherry", "grapes"};

        String[] result = obj.sortStrings(arr);

        System.out.println("Resulting array:");

        for (String str : result) {
            System.out.print(str + " ");
        }

	}

}
