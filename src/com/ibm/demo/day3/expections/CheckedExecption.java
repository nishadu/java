package com.ibm.demo.day3.expections;

public class CheckedExecption {
	static void printNums() throws InterruptedException {
		for(int i = 1; i<=10;i++) {
			Thread.sleep(250);
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		System.out.println("start");
		try {
			CheckedExecption.printNums();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
	}

}
//FileNotFoundException
//InterruptedException
//SQLException
//IOException
//ClassNotFoundException



//package com.ibm.demo.day3.exception;
//
//public class CheckedExceptionDemo {
//
//	static void printNums() {
//		for (int i = 1; i <= 10; i++) {
//			try {
//				Thread.sleep(250);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			System.out.println(i);
//		}
//	}
//
//	public static void main(String[] args) {
//		System.out.println("Start");
//		CheckedExceptionDemo.printNums();
//		System.out.println("End");
//
//	}
//}
