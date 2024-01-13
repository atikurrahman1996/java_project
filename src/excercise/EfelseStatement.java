package excercise;

import java.util.Scanner;

public class EfelseStatement {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

        // Read the integer from the user
        int n = scanner.nextInt();

        // Check the conditions and print the appropriate message
        if (n % 2 == 1) {
            // n is odd
            System.out.println("Weird");
        } else {
            // n is even
            if (n >= 2 && n <= 5) {
                // n is even and in the inclusive range of 2 to 5
                System.out.println("Not Weird");
            } else if (n >= 6 && n <= 20) {
                // n is even and in the inclusive range of 6 to 20
                System.out.println("Weird");
            } else {
                // n is even and greater than 20
                System.out.println("Not Weird");
            }
        }

        // Close the scanner to prevent resource leaks
        scanner.close();

	}

}


/*

If n  is odd, print Weird
If n is even and in the inclusive range of  2 to 5, print Not Weird
If  is even and in the inclusive range of 6 to 20 , print Weird
If n is even and greater than 50 , print Not Weird
Complete the stub code provided in your editor to print whether or not n  is weird.
 
 */
