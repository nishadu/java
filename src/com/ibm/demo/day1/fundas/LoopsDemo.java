package com.ibm.demo.day1.fundas;

public class LoopsDemo {
	public static void main(String[] args) {
		
		
		// for loop, while loop, do while loop, for each loop
		
		// for loop == find number of iterations
		//otherwise
		// while= loop- atleast 0 iteration
		//do while loop- atleast 1 iteration
		//for each loop- to iterate through array and collection elements
		
		String[] friends= { "sonu", "monu", "tonu", "ponu"};
		
		System.out.println("My friend using for loop-");
		for(int i=0;i<friends.length;i++)
		   System.out.println(friends[i]);
		
		System.out.println("My friend using for each loop-");
		
		for(String f: friends)
		   System.out.println(f);
		
		
	}

}
