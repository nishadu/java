package com.ibm.demo.day2.access;

public class LocalDemo {
	
//	static void staticMethod() {
//		System.out.println("this is from a static method");
//	}
//	
//	void instanceMethod() {
//		System.out.println("this is from a instance method");
//	}

//	public static void main(String[] args) {
//		
//		LocalDemo.staticMethod();
//		
//		LocalDemo obj = new LocalDemo();
//		obj.instanceMethod();
//		
//	}
//	static void staticMethod() {
//		System.out.println("this is from a static method");
//	}
//	
//	void instanceMethod() {
//		System.out.println("this is from a instance method");
//	}
	
	
	static int staticField = 10;
	int instanceField = 20;
	
	public static void main(String[] args) {
		
		LocalDemo.staticMethod();
		LocalDemo obj = new LocalDemo();
       	obj.instanceMethod();
       	
       	System.out.println("this is main method");
       	System.out.println(LocalDemo.staticField);
       	System.out.println(obj.instanceField);
		
	}
	static void staticMethod() {
		System.out.println("this is from a static method");
		System.out.println(LocalDemo.staticField);
		LocalDemo obj1 = new LocalDemo();
       	System.out.println(obj1.instanceField);
	}
	void instanceMethod() {
		System.out.println("this is from a instance method");
		System.out.println(LocalDemo.staticField);
       	System.out.println(instanceField);
	}
	

}
