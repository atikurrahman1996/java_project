package day6_13_OOP;


interface Animal{
	
	//public abstract void eat();
	
	public void eat();    // interface automatically consider abstract method 	
}


class Dog implements Animal {
	
	public void eat(){
		System.out.println("Dogs can eat eggs");
		
	}
	
}


class Cat implements Animal {
	
	public void eat(){
		System.out.println("Cat can eat milk");
		
	}
	
}

public class AbstractionInterface {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.eat();
		
		Cat cat = new Cat();
		
		cat.eat();
			
	}

}

// Interface is a collection of abstract methods // fully abstract // supports multiple inheritance // can't make obj in interface
// Interface keyword is used to declare an Interface like > Interface Animal {...}
// same class & same interface can extends but different class & Interface can not extends, have to use implements

//Difference between Abstract Class & Interface:
//Can have abstract & non abstract method while Interface can have abstract method
//Class doesn't support multiple inheritance while Interface does
// Abstract class is called partial abstract while Interface fully abstract 
//Interface doesn't contain constructor while class contain constructor 





















