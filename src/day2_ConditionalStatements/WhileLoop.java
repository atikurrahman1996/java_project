package day2_ConditionalStatements;

public class WhileLoop {

	public static void main(String[] args) {
		
		/*
		
		int i =1;                                  // initialization
		
		while(i<=10) {                             //conditions
			
			System.out.println("Bangladesh");
			i++;                                   //increment
		}
		
		*/
		
        int i=1;
		
	    while(i<=10)
	    {
	    
	    System.out.println(i);   // output was 1,1,1......................infinity // we have to use i++ for increment 1 then out put will match with condition 1,2,3,........10
	    i++;	
		
		
	    }
	    
	    
	    // if i want to show even numbers 
	    
	    
		    i=2;
		    
		   while(i<=10)
		   {
		    	
		   System.out.println(i);
		    i+=2;          // i=i+2;                        // increment 2
		    
	} 
		   
		   
		 // If i want o to show odd numbers 
		   
		 i=1;
		    
		   while(i<=10)
		   {
		    	
		   System.out.println(i);
		    i+=2;                 // i=i+2;               
	}
		   
	    
		
		
	}

}
