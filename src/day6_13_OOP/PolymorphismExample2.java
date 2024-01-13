package day6_13_OOP;
	
	// Base class
	class Shape {
	    void draw() {
	        System.out.println("Drawing a shape");
	    }
	}

	// Derived class 1
	class Circle extends Shape {
	                                        // Overriding the draw method for a circle
	    @Override
	    void draw() {
	        System.out.println("Drawing a circle");
	    }
	}

	// Derived class 2
	class Square extends Shape {
	                                         // Overriding the draw method for a square
	   @Override
	    void draw() {
	        System.out.println("Drawing a square");
	    }
	}

	// Main class
	public class PolymorphismExample2 {
		
	    public static void main(String[] args) {
	        // Creating objects of different shapes  // dynamic Polymorphism
	    	
	    	Shape shap1 = new Shape();
	    	shap1.draw();
	    	
	        shap1 = new Circle();
	        shap1.draw();
	        
	        shap1 = new Square();
	        shap1.draw();
	        

	 
	    }
	}



