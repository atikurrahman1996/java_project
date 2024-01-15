package day14_ExceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionExp5 {

	public static void main(String[] args) {
		
		// Specify the file path
        String filePath = "example.txt";

        // Try to create a FileReader for the specified file
        try {
            File file = new File(filePath);
            FileReader fileReader = new FileReader(file);
            System.out.println("FileReader created successfully.");

            // Close the FileReader when done (not executed in this example)
            fileReader.close();
            
        } catch (FileNotFoundException e) {
            // Handle the FileNotFoundException
            System.out.println("File not found: " + filePath);
            
            // You might want to log the exception or perform other error handling tasks.
           // e.printStackTrace(); // Uncomment this line if you want to print the exception details.
            
        } catch (Exception e) {
        	
            // Handle other exceptions
            System.out.println("An error occurred: " + e.getMessage());
            
        } finally {
        	
            // Code in this block will be executed regardless of whether an exception occurred or not
        	
            System.out.println("This block will be executed in any case.");
        }
		
		

	}

}

//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   // github token




