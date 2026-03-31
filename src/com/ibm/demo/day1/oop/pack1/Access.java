package com.ibm.demo.day1.oop.pack1;

public class Access {
	
	private static int num1=10;// within the class
	static int num2 = 20; // only with in the package
	protected static int num3= 30;// within this package
	public static int num4 = 40;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Access.num1);
		System.out.println(Access.num2);
		System.out.println(Access.num3);
		System.out.println(Access.num4);
		

	}

}
