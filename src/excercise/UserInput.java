package excercise;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        
        System.out.println("User Input is: "+a);
        System.out.println("User Input is: "+b);
        System.out.println("User Input is: "+c);
        
        scan.close();
	}

}

/*
 import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        // Read and print integers until there is no more input
        while (scan.hasNext()) {
            int a = scan.nextInt();
            System.out.println(a);
        }
        
        // Close the scanner to prevent resource leaks
        scan.close();
    }
}
 
*/
