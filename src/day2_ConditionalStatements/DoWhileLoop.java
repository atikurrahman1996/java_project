package day2_ConditionalStatements;

public class DoWhileLoop {

	public static void main(String[] args) {
		
		/*
		int i =1; 
		
		do {
			
			System.out.println(i+" Bangladesh");
			
			i++;
			
			
			
		} while(i<=10);
		
		*/
	
		
		int i=1;
		do
		{
			System.out.println(i);
			i++;
		}		
			while(i<=10);
		
	
		
		// condition false 
	
		int x=20;
		do
		{
			System.out.println(x);     // output 20 because Do..while loop first go to statement, don;t see the conditions first
			x++;
		}		
			while(x<=10);
		
		
		
		
		// the difference between WhileLoop & DoWhileLoop is : 
		//while loop doesn't print if conditions false but do while loop print at least one time if condition false
		
		
		
		
		

	}

}
