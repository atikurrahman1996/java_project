package day22_JavaMethods;

//By changing the number of arguments passed : 

public class MethodOverloadingExp2 {

	int multiply(int a, int b) {

		return a * b;
	}

	int multiply(int a, int b, int c) {

		return a * b * c;
	}

	public static void main(String[] args) {
		
		MethodOverloadingExp2 mol2= new MethodOverloadingExp2();
		
		int c = mol2.multiply(2, 3);
		int d = mol2.multiply(2, 3, 5);
		
		System.out.println(c);
		System.out.println(d);

	}

}
