package excercise;

import java.util.Scanner;

public class StringIntDouble {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

        /// Read inputs
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine(); // Consume the newline character
        String s = scan.nextLine();

        // Print outputs
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);

        // Close the scanner (optional but good practice)
        scan.close();
		

	}

}
