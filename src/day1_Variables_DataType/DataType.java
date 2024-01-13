package day1_Variables_DataType;

import java.util.Date;

public class DataType {

	public static void main(String[] args) {
		
		// Data Type >  represent type of data
		
		// Permeative data type
		
		int a = 10;
		char c = 'Z';
		double d = 20.99;
		String s = "40";
		boolean b = false;
		byte age = 30;
	    float price = 20.20F;

		System.out.println("int a: "+a);
		System.out.println("char c: "+c);
		System.out.println("double d: "+d);
		System.out.println("String s: "+s);
		System.out.println("boolean b: "+b);
		System.out.println("byte age: "+age);
		System.out.println("float price: "+price);
		
		
		
	//Approach 2 
		
		/*
		int a =20, b =30;
		
		System.out.println(a+b);
		System.out.println("The sum of integer is: "+(a+b));
		
		*/
		
		
		
		// reference data type 
		
        Date now= new Date();
		
		System.out.println(now);
		
		
		// non-premetive data type > String, ArrayList, HashMap, HashSet ...etc
		
		
		

	}

}
