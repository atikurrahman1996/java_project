package excercise;

import java.util.Scanner;

public class ExceptionExample {

	public static void main(String[] args) {
		
		int count =1; // I use variable otherwise code will run infinity time / program will not stop
		
		do {
			
			try {
				
				Scanner input = new Scanner(System.in);
				
				System.out.println("Please enter num1: ");
				int num1 = input.nextInt();
				
				System.out.println("Please enter num2: ");
				int num2 = input.nextInt();
				
				int result = num1 / num2;
				
				System.out.println("Result:"+ num1 + "/" + num2 + " " +result);
				
				count =2;
				
				input.close();
				
				
			} catch (Exception e) {
				
				System.out.println("Exception is: "+e);
				System.out.println("You must enter integer.Please try again");	
				
			}
			
		   }while(count==1);
		
		
		

	}

}


/*
 * Q1:
 Please enter num1: 
100
Please enter num2: 
7
Result:100/7 14
Please enter num1: 
100
Please enter num2: 
hello
Exception is: java.util.InputMismatchException
You must enter integer.Please try again
Please enter num1: 
100
Please enter num2: 
0
Exception is: java.lang.ArithmeticException: / by zero
You must enter integer.Please try again
Please enter num1: 

 
 */
