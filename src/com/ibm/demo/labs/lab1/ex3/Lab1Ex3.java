package com.ibm.demo.labs.lab1.ex3;

public class Lab1Ex3 {
	boolean checkNumber(int number) {
		int prevDigit=10;
		
		while(number>0) {
			int currDigit = number % 10;
			
			if(currDigit > prevDigit) {
				return false;
			}
			prevDigit = currDigit;
			number= number/10;
		}
		return true;
	}
	

}
