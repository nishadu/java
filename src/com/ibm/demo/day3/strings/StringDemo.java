package com.ibm.demo.day3.strings;

public class StringDemo {
public static void main(String[] args) {
		
		System.out.println("-- String demo --");
		
		String str = "abcdefghijmnono";	
		String str1 = "abcdefghij";

//		System.out.println(str);		
//		System.out.println(str.toUpperCase());
//		System.out.println(str.toUpperCase().toLowerCase());
//		System.out.println(str.charAt(9)); // java.lang.StringIndexOutOfBoundsException
//		System.out.println(str.contains("k"));
	System.out.println(str.compareToIgnoreCase(str1));
//		System.out.println(str.endsWith(str1));
//      System.out.println(str.getClass());
//		char[] strArr = str.toCharArray();
//		for (char ch : strArr) {
//			System.out.println(ch);
//		}
//		str. calls instance methods (0bject.methodname())
//		String. calls static methods 
	}

}

