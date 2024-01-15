package day14_18_JavaCollections;

import java.util.LinkedList;

class Student{
	
	String name, className;
	int id;
	
	// Contractors

	Student(int id, String name, String className){
		
		this.id = id;
		this.name = name;
		this.className = className;
		
	}
	
}


public class LinkedListExp2 {

	public static void main(String[] args) {
		
		LinkedList<Student> list = new LinkedList<Student>();
		
		// create student
		
		Student stdn = new Student(101, "Atik", "BSC");
		Student stdn1 = new Student(101, "Atik1", "BSC1");
		Student stdn2 = new Student(101, "Atik2", "MSC");
		
		
		list.add(stdn);
		list.add(stdn1);
		list.add(stdn2);
		
		
		// display info using for each loop
		
		
		for(Student s: list) {
			
			System.out.println(s.id+ "  " + s.name + "  " +s.className);
		}
		
		
		
	}

}
