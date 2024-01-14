package day14_ExceptionHandling;

public class ExceptionExp4 {

	public static void main(String[] args) {
	/*
		//handle the exception without maintaining the order of exceptions
		//Compile-time error
		
		try{    
		    int a[]=new int[5];    
		    a[5]=30/0;    
		   }    
		   catch(Exception e){
			   System.out.println("common task completed");
			   }    
		   catch(ArithmeticException e){
			   System.out.println("task1 is completed");
			   }    
		   catch(ArrayIndexOutOfBoundsException e){
			   
			   System.out.println("task 2 completed");
			   }    
		         System.out.println("rest of the code...");    
		         
		  */
		
		// Correct way to use exception   // super class "Exception" should used last.
		
		try {
            int a[] = new int[5];
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
        	
            System.out.println("task1 is completed");
            
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            System.out.println("task 2 completed");
            
        } catch (Exception e) {
        	
            System.out.println("common task completed");
        }
		
        System.out.println("rest of the code...");
		
		
		

	}

}
