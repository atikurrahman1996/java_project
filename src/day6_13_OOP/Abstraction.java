package day6_13_OOP;

abstract class MobileUser{
	/*
	void call() {                       // non abstract method // we can use abstract and non abstract method together
		System.out.println("I'm calling......");
	}
	
	*/
	
	abstract void sendMessage();     // abstract method 
	
}

 class Rahim extends MobileUser{
	
	 @Override
	void sendMessage(){
		 
		 System.out.println("Hi, I am Rahim");
		
	}
	
}

 class Karim extends MobileUser{
		
	 @Override
	void sendMessage(){
		 
		 System.out.println("Hi, I am Karim");
		
	}
}

   public class Abstraction {

	  public static void main(String[] args) {
		
		
		MobileUser mUser;               // superclass can not make object
		
		mUser = new Rahim();
		mUser.sendMessage();
		//mUser.call();
		
		mUser = new Karim();
		mUser.sendMessage();
		//mUser.call();
		

	}

}


/*
 * Abstraction involves hiding the complex implementation details and exposing only the essential features of an object. 
 * Abstract class start with abstract keyword > abstract class A {}
 * Can not create object in abstract class 
 * abstract class can have abstract and non abstract method, but non abstract class can not have abstract method
 * Abstract method has no body > abstract void message();  ( non abstract method > void message{....})
 * Abstract method must be in abstract class
 * 
 * To achieve abstraction > two ways > abstract class (0-100%), and Interface (100%)
 
 */
