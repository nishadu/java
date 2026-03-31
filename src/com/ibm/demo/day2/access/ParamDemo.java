package com.ibm.demo.day2.access;

public class ParamDemo {

	public static void main(String[] args) {
		
		System.out.println("----main method---");
		//Methods.withArgs(10,20);
		//Methods.withArgs();//CE
		//Methods.withArgs(10,20,30); //CE
		
		//call all the methods here
		Methods.withArgsNoReturn(10,20);
		Methods.noArgsNoReturn();
		System.out.println(Methods.withReturnWithArgs(10, 20));
		System.out.println(Methods.withReturnNoArgs());;

	}

}
class Methods {
	static void withArgsNoReturn(int i, int j) {
		System.out.println(i+j);
		// return i +j // CE
	}
	static void noArgsNoReturn() {
		System.out.println(0);
	}
	static int withReturnWithArgs(int i, int j) {
		
		return i +j;
	}
	static int withReturnNoArgs() {
	
		return 100;
	}
	
	
	
	
	
	
	
	
	
}