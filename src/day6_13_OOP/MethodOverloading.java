package day22_JavaMethods;

//By changing the return type : int and double

public class MethodOverloading {
	
	int multiply(int a,int b){
        return a*b;
    }
    double multiply(double a,double b){
         return  a*b;
    }

	public static void main(String[] args) {
		
		
		MethodOverloading mOverloading= new MethodOverloading();
		
//		mOverloading.multiply(4, 5);
//		mOverloading.multiply(5.5, 5.4);
//		
//		System.out.println(mOverloading.multiply(4, 5));
//		System.out.println(mOverloading.multiply(5.5, 5.4));
		
		
		int c = mOverloading.multiply(4, 5);
		double d =mOverloading.multiply(5.5, 5.4);
		
		System.out.println(c);
		System.out.println(d);
		

	}

}

/*
 In Java, it is possible for a class to contain two or more methods with the same name but with different parameters. Such methods are called Overloaded methods.
 Method overloading is used to increase the readability of the program.
 Note: Method overloading cannot be performed by changing the return type of methods.
 */

