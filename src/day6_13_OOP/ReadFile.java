package day18_FileIO;

import java.io.File;
import java.util.Scanner;

public class ReadFile {

	public static void main(String[] args) {

		try {

			File file = new File("C:\\Users\\SQA\\OneDrive\\Desktop\\JAVA\\learningJava\\Expfile/FileName2.txt");

			Scanner scanner = new Scanner(file);

			while (scanner.hasNext()) {

				String id = scanner.next();
				String name = scanner.next();

				System.out.println("ID: " + id + " Name: " + name);

			}

			scanner.close();

		} catch (Exception e) {

			System.out.println(e);

		}

		/*
		 * try {
		 * 
		 * File myObj = new File(
		 * "C:\\\\Users\\\\SQA\\\\OneDrive\\\\Desktop\\\\JAVA\\\\learningJava\\\\Expfile/FileName.txt"
		 * );
		 * 
		 * Scanner myReader = new Scanner(myObj);
		 * 
		 * while (myReader.hasNextLine()) {
		 * 
		 * String data = myReader.nextLine(); System.out.println(data); }
		 * 
		 * myReader.close();
		 * 
		 * } catch (FileNotFoundException e) {
		 * 
		 * System.out.println("An error occurred.");
		 * 
		 * //e.printStackTrace(); }
		 * 
		 */

	}

}
