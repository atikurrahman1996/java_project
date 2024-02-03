package day22_JavaMethods;

class A{
    public void meth1(){
        System.out.println("I am method 1 of class A");
    }
}

class B extends A{
    @Override
    public void meth1(){
        System.out.println("I am method 1 of class B");
    }
}


public class MethodOverridingDemo {

	public static void main(String[] args) {
		
		A objA = new A();
		objA.meth1();
		
		B objB= new B();
		objB.meth1();
		

	}

}


//If the child class implements the same method present in the parent class again, it is know as method overriding.
//The subclass can override the method of the parent class only when the method is not declared as final. 