package com.ibm.demo.labs.lab2.ex1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SecondSmallest obj = new SecondSmallest();
		int[]arr= {5,2,8,1,5};
		
		int result =obj.getSecondSmallest(arr);
		
		System.out.println("second smallest element is :" +result);

	}

}
