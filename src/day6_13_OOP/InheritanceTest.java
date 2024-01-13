package day6_13_OOP;

public class InheritanceTest {

	public static void main(String[] args) {
		
		InheritanceSubClass subClass =new InheritanceSubClass();
		
		subClass.name = "Atik";
		subClass.age = 28;
		subClass.occupation = "SQA Engineer";
		
		subClass.displayInfo2();
		

	}

}


// private variables unable to inherit/ access but we can use setter and getter method to inherit/access private variables
// In Inheritance > "super" keyword is used to refer immediate super class object 
// "Super" keyword is used to call super class instance variable / method / constructor