package day14_18_JavaCollections;

import java.util.LinkedList;

public class LinkedListExp1 {

	public static void main(String[] args) {
		
		// How to declare LinkedList
		
		
		LinkedList<String> countryList = new LinkedList<String>();
		
		countryList.add("Afghanistan");  //index 1
		countryList.add("Bangladesh");
		countryList.add("Canada");
		countryList.add("Denmark");
		countryList.add("England");
		countryList.add("Finland");
		countryList.add("Germany");
		countryList.add("Hong Kong");
		countryList.addFirst("Singapore");   //index 0
		countryList.addLast("Malaysia");
		
		
		System.out.println(countryList);
		
		// Size of the list
		
		System.out.println(countryList.size());  //output 10
		
		
		// remove an element
		
				countryList.remove(2);             // index 2 > Bangladesh
				//countryList.remove("Bangladesh");

				System.out.println("After removing element: " +countryList); 
				System.out.println(countryList.size()); // output 9
				
				
		// inserting new element in Array List
				
				countryList.add("USA");
		
				System.out.println("After adding element: " +countryList); 
				System.out.println(countryList.size()); // output 10
				
				countryList.add(6, "Australia");    // add with index and parameter 
		
				System.out.println("After adding element: " +countryList); 
				System.out.println(countryList.size()); // output 11
				
				
				
			// read value from array list 
				
				
				for(String s: countryList)
					{
					System.out.println(s);
					}
				
				
				//countryList.clear();

	}

}
