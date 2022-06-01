package com.Collections;

import java.util.HashMap;

public class HashMapExample {
	
	//Duplicate key-value pair is not allowed
	//Duplicate key is not allowed
	//Duplicate value is allowed
	//Null value is allowed
	
	public void getJersyNumber() {
		
		HashMap<Integer, String> objHashMap = new HashMap<Integer, String>();
		
		objHashMap.put(10, "Sachin Tendulkar");
		objHashMap.put(44, "Virendra Sehwag");
		objHashMap.put(18, "Virat Kohli");
		objHashMap.put(45, "Rohit Sharma");
		objHashMap.put(7, "MS Dhoni");
		objHashMap.put(9, "Ravindra Jadeja");
		objHashMap.put(9, "Ravindra Jadeja"); //Duplicate key and value
		objHashMap.put(8, "Ravindra Jadeja"); //Duplicate value
		objHashMap.put(9, "Murali Vijay"); //Duplicate Key
		objHashMap.put(null, null);
		
		System.out.println("------Jersy Numbers of Players-----");
		
		System.out.println("All key-value players : "+objHashMap.toString());
		
		System.out.println("Is hashmap empty? - "+objHashMap.isEmpty());
		
		objHashMap.replace(44, "Murali Vijay");
		System.out.println("List after Replacement : "+objHashMap.toString());
		
		System.out.println("Check if list contains 18 key : "+objHashMap.containsKey(18));
	}

}
