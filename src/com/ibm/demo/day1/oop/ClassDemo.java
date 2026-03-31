package com.ibm.demo.day1.oop;

public class ClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// datatype var op value  sep 
		//int         num  =   10  ;
		         // object name
		Employee emp = new Employee();
		emp.id=1;
		emp.name= "sonu";
		emp.salary=90000;
		//System.out.println(emp.id+" "+emp.name+" "+emp.salary);
		System.out.println(emp.toString());
		emp.work();
		
		Employee emp2 = new Employee();
		emp2.id=2;
		emp2.name= "Monu";
		emp2.salary=92000;
		//System.out.println(emp2.id+" "+emp2.name+" "+emp2.salary);
		System.out.println(emp2.toString());// it will print object address
		emp2.work();

	}

}
