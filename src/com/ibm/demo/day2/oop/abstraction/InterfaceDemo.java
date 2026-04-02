package com.ibm.demo.day2.oop.abstraction;

import com.ibm.demo.day2.oop.abstraction.DemoInterface.DemoClass;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		DemoClass obj = new DemoClass();
		obj.absMethod();
		DemoInterface.staticMethod();
		obj.defaultMethod();

	}

}
// interface also contain concrete class after java 8
// interface allow multiple interface in java
// interface can contain one or more abstract methods
// can also contain static methods
// can also contain default methods(like instance method)
// abstract -- we can't create object 