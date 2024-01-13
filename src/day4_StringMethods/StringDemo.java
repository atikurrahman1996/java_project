package day4_StringMethods;

public class StringDemo {

	public static void main(java.lang.String[] args) {
		
		 
		String s = "Welcome";
		System.out.println(s.length());    // s.length method // output 7
		
		
		// concatenation method / join to two string 
		
		String s1 ="Welcome";
		String s2 = "to the java program";
				
		System.out.println(s1.concat(s2));  
		
		
		// trim method for removing space 
		
		String s3 ="     Welcome";
		
		System.out.println(s3.trim()); 
		
		
		// chartAt method 
		
		String s4 ="Welcome";
		
		System.out.println(s4.charAt(5));      // output m , index start from 0, 1.......
		
		
		// contains method
		
        String s5 ="Welcome";                      
		
		System.out.println(s5.contains("Wel")); // true   
		System.out.println(s5.contains("wel")); // false 
		System.out.println(s5.contains("com")); // true 
		
		
		// comparing String equal() method 
		
		String s6="Welcome";
				
		System.out.println(s6.equals("Welcome"));   // true 	
		System.out.println(s6.equals("welcome"));   // false 
		System.out.println(s6.equals("Wel  come"));   // false

		// equalIgnorecase method 
		
	    System.out.println(s6.equalsIgnoreCase("welcome"));   // true 
	    
	    
	      // replace method 
		
	 		s="Welcome";
	 		
	 		System.out.println(s.replace('W','v'));    // replace single letter
	 		
	 		
	 		s="Welcome to Java";
	 		
	 		System.out.println(s.replace("Java", "Selenium"));  // replace character 
	 		
	 		
	 		// SubString Method       // starting index start from 0,1,2..............
	 		                          // Ending index start from 1,2,3................
		
	 		
	 		s= "Welcome to the java";
			
			System.out.println(s.substring(1,3));  // output el
			System.out.println(s.substring(2,7));  // lcome
			System.out.println(s.substring(3,9));  // come t

			System.out.println(s.substring(0,4));  // output Welc
			System.out.println(s.substring(2,4));  // output lc
			
			
			// toLowerCase method 
			
			s="WELCOME"; 
			
			System.out.println(s.toLowerCase());  // output welcome
			
			// toUpperCase Method
			
			s="welcome";
			
			System.out.println(s.toUpperCase());  // WELCOME

	}

}


// order of operators - first priority (), *, /, +,-,
