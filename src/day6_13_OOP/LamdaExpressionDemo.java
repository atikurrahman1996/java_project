
package day6_13_OOP;

@FunctionalInterface
interface Drawable{
	public void draw();
	
}
public class LamdaExpressionDemo {

	public static void main(String[] args) {
		
		int width = 10;
		
		//with lambda  
        Drawable drwDrawable=()-> { 
        	
            System.out.println("Drawing "+width);  
        };
        
        drwDrawable.draw();  
		
		
	
			

	}

}


// without lambda expression example: 

/*
 interface Drawable{
	public void draw();
	
}
public class LamdaExpressionDemo {

	public static void main(String[] args) {
		
		int width = 10;
		
		Drawable drwDrawable = new Drawable() {
			
			@Override
			public void draw() {
				
				System.out.println("Drawing "+ width);
				
			}
		};
		
		drwDrawable.draw();
			

	}

}
 
 */


/*
A lambda expression is a short block of code which takes in parameters and returns a value. Used only for Functional Interface
Functional Interface: Lambda expression provides implementation of functional interface. An interface which has only one abstract method is called functional interface. 
Java provides an anotation @FunctionalInterface, which is used to declare an interface as functional interface.

Why use Lambda Expression:
To provide the implementation of Functional interface.
Less coding.
*/