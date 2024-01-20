
//Question 2: Add a step method in the welcome thread of question 1 to delay its execution for 200ms.


package excercise;

class Thread3 extends Thread{
	
	public void run() {
		
		try {
			Thread1.sleep(2000);
			
		} catch (InterruptedException e) {
			
			System.out.println(e);
		}
		
		System.out.println("Good Morning");
	}
}

class Thread4 extends Thread {
    public void run() {
            System.out.println("Welcome");
        }
    }


public class MultithreadingExcercise2 {

	public static void main(String[] args) {
		
		Thread3 t1= new Thread3();
        Thread4 t2= new Thread4();
        t1.start();
        t2.start();
		

	}

}
