package com.ibm.demo.day1.oop;

public class StaticDemo {
	
	
	// static fields --belongs to  class-- common to all objects
	// ==free access
	static int num1 = 10;
	
	// instance fields -- belongs to objects-- unique to all objects
	//== restricted access
	int num2 = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// static field-- access as ClassName.fieldName
		System.out.println(StaticDemo.num1);
		// instance filed -- assess as objectName.filedNmae
		StaticDemo obj = new StaticDemo();
		System.out.println(obj.num2);

	}

}
