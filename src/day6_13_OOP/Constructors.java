package day6_13_OOP;

public class Constructors {
	
	// Constructor is special type of method  // Used for initializing the class variables  // two type : default constructors & Parameterize constructors
	// constructor name should be same as class name // Constructors will not return any type of value  // Constructors will invoke at the time of object creation 
	
	
	/*
	// default constructors
	
	
	int x;
	int y;
	
	
	Constructors() {
		
		x=20;
		y=30;
	}
	
	void display(){
		
		System.out.println(x+y);
		
		
	}

	public static void main(String[] args) {
		
		Constructors constr = new Constructors();  //  // invoke default constructor
		
		constr.display();
	

	}
	*/
	
	// Parameterize constructors
	
	
	// default constructors
	
	
		int x;
		int y;
		
		
	Constructors() {
			
			x=20;
			y=30;
		}
	
	
	Constructors(int a, int b) {    // Parameterize constructors
		
		x=a;
		y=b;
	}
	
	void display(){
		
		System.out.println(x+y);
		
		
	}

	public static void main(String[] args) {
		
		Constructors constr = new Constructors(100,200);  //Parameterize constructor
		
		constr.display();
	

	}
	
	
	

}
