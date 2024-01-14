package day14_ExceptionHandling;

public class ExceptionExp1 {

	public static void main(String[] args) {
		
		/*
		//An Arithmetic Exception > not using try & catch block > through exception
		
			 int d = 0;
			 int n = 20;
			 int f = n/d;
			 
			 System.out.println("End Of Main");
			
			*/
		
		/*
		//An Arithmetic Exception > using try & catch block
		
		  int d = 0;
		  int n = 20;
		  
		  try {
			  
			  
		   int div = n / d;  
		   
		   System.out.println("This line will not be Executed");
		   
		  } catch (ArithmeticException e) {
			  
		   System.out.println("In the catch Block due to Exception = " + e);
		  }
		  
		  System.out.println("End Of Main");
		  
		  */
		
		
		/*
		//ArrayIndexOutOfBoundsException  // ArithmeticException

			  try {
			   int d = 1;             // if d = 0 through > ArithmeticException
			   int n = 20;
			   int div = n / d;
			   
			   int [] a = new int[4];   // index > 0,1,2,3
			   a[4] = 10;
			   
			  }
			  
			  catch (ArithmeticException e) {
				  
			   System.out.println("In the catch block due to Exception = " + e);
			   
			  } catch (ArrayIndexOutOfBoundsException e) {
				  
			   System.out.println("In the catch block due to Exception = " + e);
			  }
				  
			    System.out.println("End Of Program");
			    
			   */
		
		// finally block 
		
		try{
		       int d = 0;
		       int n =20;
		       int fraction = n/d;
		    }
		
		  catch(ArithmeticException e){
			  
		    System.out.println("In the catch block due to Exception = "+e);
		  }
		
		  finally{
			System.out.println("Inside the finally block");
		  }

	}

}

/*
An Exception is a run-time error which interrupts the normal flow of program execution.
Errors are classified into two categories: 1. Compile time errors – Syntax errors, 2. Runtime errors- Exception
An exception can occur for many different reasons: 
A user has entered an invalid data.
A file that needs to be opened cannot be found.
A network connection has been lost in the middle of communications
Exception Handler is a set of code that handles an exception. Exceptions can be handled in Java using try & catch.
Try block: Normal code goes on this block / which code will be through error 
Catch block: If there is error in normal code, then it will go into this block
*/