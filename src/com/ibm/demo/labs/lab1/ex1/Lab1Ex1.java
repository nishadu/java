package com.ibm.demo.labs.lab1.ex1;

public class Lab1Ex1 {
	
	public int  calculateSum(int n) {
	int sum =0;
	
	 for(int i= 1; i<=n;i ++) {
		 if(i % 3==0 || i % 5 ==0) {
			 sum = sum +i;
		 }
		 
	 }
	 return sum;
	



}
}
