package com.ibm.demo.day2.access;

public class AccessSpecifiersDemo {
//	static int num;  //class level field it initialize value as 0(default) 
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		// local class level/ local variable
//		int num2= 2;
//		
//		System.out.println(num);
//		System.out.println(num2);
//
//	}
	
	//static final int finalField = 10;
	static final int FINAL_FIELD = 10;//snake case
	
	
	public static void main(String[] args) {
//		final int finalLocalField=20;
//		System.out.println(FinalLocalField);
		
		System.out.println(AccessSpecifiersDemo.FINAL_FIELD);
		System.out.println(Integer.MAX_VALUE);
	}

}
