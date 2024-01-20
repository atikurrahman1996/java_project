//Question 3: Demonstrate gerPriority() and setPriority() methods in Java threads.

package excercise;

class Thrd1 extends Thread{
    public void run(){
        System.out.println("Welcome");
    }
}
class Thrd2 extends Thread {
    public void run() {
            System.out.println("Good morning");
        }
    }

public class MultithreadingExcercise3 {

	public static void main(String[] args) {
		
		Thrd1 thrd1 = new Thrd1();
		Thrd2 thrd2 = new Thrd2();
		
		thrd1.start();
		thrd2.start();
		
		//thrd1.setPriority(1);
		//thrd2.setPriority(10);   // most priority 
		
		thrd1.setPriority(Thread.MIN_PRIORITY);
		thrd2.setPriority(Thread.MAX_PRIORITY); 
		
		System.out.println(thrd1.getPriority());
		System.out.println(thrd2.getPriority());
		
		
		

	}

}
