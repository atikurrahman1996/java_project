package day1_Variables_DataType;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		/*
		Scanner input = new Scanner(System.in);
		
		String name; 
		
		System.out.print("Enter your name: " );
		
		name = input.nextLine();
		
		System.out.println("Welcome:"+name);
		
		input.close();
		
		*/
		
		
        Scanner input = new Scanner(System.in);
		
		int number; 
		
		System.out.print("Enter any number: " );
		
		number = input.nextInt();
		
		System.out.println("This is your input number:"+number);
		
		input.close();

	}

}
