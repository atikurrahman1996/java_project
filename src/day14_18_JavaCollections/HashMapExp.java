package day14_18_JavaCollections;

import java.util.HashMap;

public class HashMapExp {

	public static void main(String[] args) {
		
		//The HashMap class has many useful methods. to add items to it, use the put() method:
		//To access a value in the HashMap, use the get() method
		
		HashMap<Integer, String> customer = new HashMap<Integer, String>();
		
		// add > put 
		
		customer.put(101, "Atik");      // 101 is key, Atik is value 
		customer.put(102, "Atikur Rahman");
		customer.put(103, "Atik Ariyan");
		
		// access > get
		
		System.out.println(customer.get(101));
		System.out.println(customer.get(102)); 
		System.out.println(customer.get(103)); 
		
		System.out.println("Customer list size is:" + customer.size());
		
	}

}

/*
 * A HashMap however, store items in "key/value" pairs, and you can access them by an index of another type (e.g. a String).
  One object is used as a key (index) to another object (value). It can store different types: String keys and Integer values, 
  or the same type, like: String keys and String values: 
*/