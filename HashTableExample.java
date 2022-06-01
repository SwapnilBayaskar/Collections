package com.Collections;

import java.util.Hashtable;

public class HashTableExample {
	
	public void getFlatNumbers() {
		
		Hashtable<Integer, String> objHashtable = new Hashtable<Integer, String>();
		
		objHashtable.put(101, "Patil");
		objHashtable.put(102, "Pawar");
		objHashtable.put(103, "Deshpande");
		objHashtable.put(201, "Aware");
		objHashtable.put(202, "Raut");
		objHashtable.put(203, "Patil");
		objHashtable.put(203, "Patil");//Duplicate
		
		try {
			
			objHashtable.put(301, null);
			
		} catch (NullPointerException exception) {
			
			System.out.println("Exception Occured : "+exception.getMessage());
			exception.printStackTrace();
		}
		
		System.out.println("Displaying all flat numbers : "+objHashtable.toString());
		
		System.out.println("Size of the table : "+objHashtable.size());
		
		System.out.println("Is table empty ? - "+objHashtable.isEmpty());
		
		objHashtable.remove(103);
		System.out.println("After Removing 103 : "+objHashtable.toString());
		
		
	
		
	}
	
	
	
}
