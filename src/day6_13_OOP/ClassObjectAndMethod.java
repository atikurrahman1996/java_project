package day6_13_OOP;

public class ClassObjectAndMethod {
	
	//class -is a collection of variables and methods          // Object- Object is an instance of a class 
	                                                           // Method - Block of code which contain logic
	// declare variables 		
	
	int emplyid;           // Variables
	String emplyname;      // Variables
	Double sal;          // Variables
	int deptno;         // Variables
	String job;       // Variables
	
	void displayInformation() {                    // method
		
		System.out.println(emplyid);     
		System.out.println(emplyname);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
		
	}
	

	public static void main(String[] args) {
		
		// creating object
		
		ClassObjectAndMethod oop1 = new ClassObjectAndMethod();
		
		oop1.emplyid = 101;
		oop1.emplyname = "Atik";
		oop1.sal = 50000.00;
		oop1.deptno = 24;
		oop1.job ="QA";
		
		oop1.displayInformation(); 
		
		
		
	}

}
