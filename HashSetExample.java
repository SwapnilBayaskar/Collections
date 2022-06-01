package com.Collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
	
	//Duplicate Value is not allowed
	//It allows null value
	
	public void getUniqueDataList() {
		
		Set<Integer> objSet = new HashSet<Integer>();
		
		objSet.add(2);
		objSet.add(4);
		objSet.add(6);
		objSet.add(8);
		objSet.add(10);
		objSet.add(12);
		objSet.add(14);
		objSet.add(14); //Duplicate Value
		objSet.add(null); //null
				
		System.out.println("Data in the List : "+objSet.toString());
		System.out.println("Size of the Hashset : "+objSet.size());
		
		objSet.remove(14); //Removing both 14
		System.out.println("List after Removal : "+objSet.toString());
		
		System.out.println("Size of the Hashset after Removal : "+objSet.size());
				
		objSet.removeAll(objSet);
		System.out.println("Data after removing all : "+objSet.toString());
		System.out.println("Is set empty? - "+objSet.isEmpty());
	}

}
