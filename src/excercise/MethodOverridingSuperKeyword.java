package excercise;

//You need to use the super keyword to call the define_me method from the superclass (BiCycle).

class BiCycle{
	String define_me(){
		return "a vehicle with pedals.";
	}
}

class MotorCycle extends BiCycle{
	String define_me(){
		return "a cycle with an engine.";
	}
	
	MotorCycle(){                                                              //constructor > would be same as class
		System.out.println("Hello I am a motorcycle, I am "+ define_me());
		
        String temp = super.define_me();       // called super class using "super" keyword and assign the result to the variable temp. 
        
		System.out.println("My ancestor is a cycle who is "+ temp );
	}
}


public class MethodOverridingSuperKeyword {

	public static void main(String[] args) {
		
		MotorCycle M = new MotorCycle();
	}
	
}


