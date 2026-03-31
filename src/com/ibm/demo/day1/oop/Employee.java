package com.ibm.demo.day1.oop;

public class Employee {
	
	
	// static fields --belongs to  class-- common to all objects
	static int officePhone;
	
	// instance fields -- belongs to objects-- unique to all objects
	int id;
	String name;
	//String phone;
	//String email;
	double salary;
	
	// long[] phone;
	// Address address;
	
	//class-- entity;
	// variable--- fields;
	
	
	void work() {
		System.out.println("Employee  " +name+" is working");
		
	}
// it will print to string ,to avoid writing sop 
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
