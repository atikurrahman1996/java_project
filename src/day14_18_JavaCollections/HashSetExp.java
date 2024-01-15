package day14_18_JavaCollections;

import java.util.HashSet;

public class HashSetExp {

	public static void main(String[] args) {
		
		HashSet<String> fruitsName = new HashSet<String>();
		
		// to add items
		
		fruitsName.add("Apple");
		fruitsName.add("Orange");
		fruitsName.add("Banana");
		fruitsName.add("Pineapple");
		fruitsName.add("Graps"); 
		
		System.out.println(fruitsName);
		
		System.out.println("Siz of the fruits list: "+ fruitsName.size());
		
		// remove an items
		
		fruitsName.remove("Pineapple");
		System.out.println(fruitsName);
		System.out.println("Siz of the fruits list: "+ fruitsName.size());
		
		//To check whether an item exists> use the contains() method:
		
		fruitsName.contains("Apple");
		
		// clear the list
		
		//fruitsName.clear();
		
		//System.out.println(fruitsName);	
		
	}

}


// A HashSet is a collection of items where every item is unique
// The HashSet methods. to add items to it> use the add() method: 
// To check whether an item exists> use the contains() method:
// Difference between set and list is > set items would be unique while we can add duplicate value in list
