package excercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandingExp {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        try {
            int x = scanner.nextInt();
            int y = scanner.nextInt();

            // Check if y is zero
            if (y == 0) {
                throw new ArithmeticException("/ by zero");
            }

            int result = x / y;
            System.out.println(result);
            
        } catch (InputMismatchException e) {
            // Handle if x or y is not an integer
            System.out.println("InputMismatchException is..."+ e.getMessage());
            
        } catch (ArithmeticException e) {
            // Handle division by zero
            System.out.println("ArithmeticException is: " + e.getMessage());
            
        } catch (Exception e) {
            // Handle other exceptions
            System.out.println(e.getClass().getName());
            
        } finally {
        	
        	System.out.println(" program closed");
            scanner.close();
        }
		

	}

}
