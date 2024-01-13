package day6_13_OOP;

 class User {
	
	// declare variables 
	
	String name, gender;
	int phone;
	
}

public class OOPTest {

	public static void main(String[] args) {
		
		// creating object
		
		User oop = new User();
		
		oop.name = "Atik";
		oop.gender ="Male";
		oop.phone = 1608403976;

		
		System.out.println("Name is: "+ oop.name);
		System.out.println("Gender is: "+ oop.gender );
		System.out.println("Phone number is: "+ oop.phone);
		
		
}
	
}