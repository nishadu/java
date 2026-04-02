package com.ibm.demo.day3.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionAndGenericDemo {
	
	public static void main(String[] args) {
		
		List<String> myFriends = new ArrayList<>();
		
		System.out.println("Size " + myFriends.size());
		System.out.println(myFriends);
		myFriends.add("Sonu");
		myFriends.add("Monu");
		System.out.println("Size " + myFriends.size());
		System.out.println(myFriends);
		myFriends.remove(0);
		System.out.println("Size " + myFriends.size());
		System.out.println(myFriends);
		myFriends.add("Tonu");
//		myFriends.add(10,50);
//		myFriends.add(20);
//		myFriends.add(false);
		
		System.out.println("Size " + myFriends.size());
		System.out.println(myFriends);
		
	}

}
