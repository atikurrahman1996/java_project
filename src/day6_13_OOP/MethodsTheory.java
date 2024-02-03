package day22_JavaMethods;

/*
 * A method is a function written inside a class. Since Java is an object-oriented language, we need to write the method inside some class.

Syntax of a method : returnDataType nameOfMethod() { //Method body}
The following method returns the sum of two numbers:
int mySum(int a, int b) {
	int c = a+b;
	return c;	//Return value
}

Calling a Method : 
A method can be called by creating an object of the class in which the method exists followed by the method call:

Calc obj = new Calc(); //Object Creation

obj.mySum(a , b); //Method call upon an object

Void return type : 
When we don’t want our method to return anything, we use void as the return type. void show{}


 */

public class MethodsTheory {
	
	int sum(int a, int b) {
		
		return a+b;
	}

	public static void main(String[] args) {
		
		
		MethodsTheory obj= new MethodsTheory();
		
		//obj.sum(10, 15);
		//System.out.println(obj.sum(10, 15));
		
		int c = obj.sum(10, 15);
	    System.out.println(c);

	}

}
