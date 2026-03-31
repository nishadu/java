package com.ibm.demo.day1.oop.method;

public class MethodDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		
		// calling methods from calc
		System.out.println(Calc.pi());
		
		System.out.println(Calc.addNums(i, j));
		
		Calc.addPrintNums(i, j);
		
		Calc c = new Calc();
		System.out.println(c.subtract(i, j));

	}

}
