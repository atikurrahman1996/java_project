package day6_13_OOP;

//base class 

 class Poly {

     void display() {
		
		System.out.println("I am a polymorphism");
	 }

}

// subclass

class Person extends Poly{
	
	@Override
	void display() {
		
		System.out.println("I am a person");
	}
}

class Student extends Poly{
	
	@Override
     void display() {
		
		System.out.println("I am a Student");
	 }

}



public class Polymorphism {

	public static void main(String[] args) {
		
		// Static Polymorphism
		
		/*
		Poly poli = new Poly();
		Person per = new Person();
		Student stdn = new Student();
		
		poli.display();
		per.display();
		stdn.display();
		*/
		
		// Run time/dynamic  Polymorphism
		
		Poly poli = new Poly();   // super/parent class object
		poli.display();
		
		poli = new Person();
		poli.display();
		
		poli = new Student();
		poli.display();
		
		
	}

}

//Polymorphism is called many forms, Polymorphism works like -polimorf( Bangla -bohuropi)
//Two type Polymorphism > Compile Time ( method overloading) & Run Time (method overriding)
//Polymorphism is a mechanism where a parent class reference variable can take many forms,(It can refer object from different classes).










