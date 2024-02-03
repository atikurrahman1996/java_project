package day18_FileIO;

import java.io.FileNotFoundException;
//import java.io.FileWriter;
//import java.io.IOException;
import java.util.Formatter;
//import java.util.InputMismatchException;
import java.util.Scanner;

public class WriteFile {

	public static void main(String[] args) {
		/*
		try {
		      FileWriter myWriter = new FileWriter("C:/Users/SQA/OneDrive/Desktop/JAVA/learningJava/Expfile/Student.txt");
		      
		      myWriter.write("Files in Java might be tricky, but it is fun enough!");
		      
		      myWriter.close();
		      
		      System.out.println("Successfully wrote to the file.");
		      
		    } catch (IOException e) {
		    	
		      System.out.println("An error occurred.");
		      
		      //e.printStackTrace();
		    }
		*/
		
		/*
		// 2nd approach 
		
		try {
			
			Formatter formatter = new Formatter("C:/Users/SQA/OneDrive/Desktop/JAVA/learningJava/Expfile/FileName.txt");
			
			formatter.format("%s %s\r\n", "101", "Atik");
			formatter.format("%s %s\r\n", "102", "Atik2");
			formatter.format("%s %s\r\n", "103", "Atik3");
			
			formatter.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
		}
		
		*/
		
		//3rd approach > using scanner method > user Input
		
		String id, name;
		
		
        try {
			
			Formatter formatter = new Formatter("C:/Users/SQA/OneDrive/Desktop/JAVA/learningJava/Expfile/FileName2.txt");
			Scanner input = new Scanner(System.in);
			System.out.println("How many students? :  ");
			int num = input.nextInt();
			
			for( int i =1; i<=num; i++) {
				
				System.out.print("Enter student id and name: ");
				
				id = input.next();
				name = input.next();
				
				formatter.format("%s %s\r\n", id, name);
			}
			
			formatter.close();
			input.close();
			
		} catch (FileNotFoundException e) {
			
			System.out.println(e);
			
		
		}
		
	}

}
