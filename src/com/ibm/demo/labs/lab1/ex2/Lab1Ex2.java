package com.ibm.demo.labs.lab1.ex2;

public class Lab1Ex2 {
	int calculateDifference(int n) {
		int sum =0;
		int sumOfSquare=0;
	
	for(int i= 1; i<=n;i ++) {
		sum+=i;
		sumOfSquare += i*i;
		 }
		 
	 int squareOfSum = sum*sum;
	 return sumOfSquare-squareOfSum;
	

}

}
