
//Question 1: Write a program to print "Good morning" and "Welcome" continuously on the screen in Java using threads.


package excercise;

class Thread1 extends Thread{
	
	public void run(){
		
		while(true) {
			System.out.println("Good Morning");
		}
		
	}
	
}

class Thread2 extends Thread{
	
	public void run(){
		
while(true) {
	
	System.out.println("Welcome");
}
		
	}
	
}

public class MultithreadingExcercise1 {

	public static void main(String[] args) {
		
		Thread1 thread1 = new Thread1();
		Thread2 thread2 = new Thread2();
		
		thread1.start();
		thread2.start();
		

	}

}
