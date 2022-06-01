package com.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	//Duplicate values are allowed
	
	public void getPlayingEleven() {
		
		List<String> objList = new ArrayList<String>();
		
		objList.add("Ruturaj");
		objList.add("Convoy");
		objList.add("Moeen");
		objList.add("Dhoni");
		objList.add("Rayudu");
		objList.add("Uthappa");
		objList.add("Jadeja");
		objList.add("Shivam");
		objList.add("Chahar");
		objList.add("Tahir");
		objList.add("Choudhary");
		objList.add("Choudhary");
		
		Iterator<String> objIterator = objList.iterator();
		
		while(objIterator.hasNext()) {
			System.out.println(objIterator.next());
		}
		
		System.out.println("List of all players : "+objList.toString());
		
		
		objList.remove(11);
		System.out.println("List after Removing the 12th player : "+objList.toString());
		
		System.out.println("Name of the player at 3rd: "+objList.get(3));
		
		System.out.println("Size of the list : "+objList.size());
		
		System.out.println("Is list Empty? - "+objList.isEmpty());
		
		objList.clear();
		System.out.println("List after clearing : "+objList.toString());
		System.out.println("Is list Empty? - "+objList.isEmpty());
	}

}
