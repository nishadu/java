package com.ibm.demo.day2.oop.abstraction;

public interface DemoInterface {
	
	 //public abstract void absMethod(); // inside interface we abstract  is default no need to mention
	void absMethod();


public static void staticMethod() {
	System.out.println("static method");
}
public default void defaultMethod() {
	System.out.println("default method");
}


class DemoClass implements DemoInterface{
	@Override
	public void absMethod() {
		System.out.println("abs method implemented");
	}
}
}