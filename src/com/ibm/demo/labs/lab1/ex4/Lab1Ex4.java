package com.ibm.demo.labs.lab1.ex4;

public class Lab1Ex4 {
	boolean checkNumber(int n) {
		if(n<=0) {
			return false;
		}
		return(n &(n-1))==0;
	}

}
