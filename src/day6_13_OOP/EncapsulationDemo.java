package day6_13_OOP;

public class EncapsulationDemo {
	
	//Variables declaration > make it private > make it public using setter & getter method
	
	private String name;
	private int age;
	
	
	public void setName(String name) {
		this.name = name;
		
	}

	public String getName() {
		return name;
		
		
	}
	
	public void setAge(int age) {
		this.age = age;
		
	}

	public int getAge() {
		return age;
		
		
	}
	
	// for auto generate setter & getter method > right click > select setter & getter method 

	
	public static void main(String[] args) {
		
		
		EncapsulationDemo p1 = new EncapsulationDemo();
		p1.setName("Atik");
		p1.setAge(28);
		
		System.out.println("User name is: "+p1.getName());
		System.out.println("User age is: "+p1.getAge());
		

	}

}


//Encapsulation > works like a medicine capsul 

/*
It involves bundling the data (attributes or fields) and methods (functions or procedures) that operate on the data into a single unit known as a class.
This helps in controlling access to the data and preventing unintended interference from outside code.
In Java, encapsulation is implemented using access modifiers (public, private, protected, default) to control the visibility of class members. 
 */
