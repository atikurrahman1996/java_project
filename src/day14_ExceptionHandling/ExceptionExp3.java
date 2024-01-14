package day14_ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionExp3 {

	public static void main(String[] args) {
		
		/*
		// multiple try catch block
		
		try{    
            int a[]=new int[5];    
            a[5]=30/0;    
            System.out.println(a[10]);  
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code"); 
		*/
		
		
		//FileNotFoundException
		
		PrintWriter pw;
		
        try {  
            pw = new PrintWriter("jtp.txt"); //may throw exception   
            System.out.println(pw); 
        }  
           // providing the checked exception handler
        
          catch (FileNotFoundException e) {  
              
            System.out.println(e);  
        }         
            System.out.println("File saved successfully");   
		
		
	}

}
