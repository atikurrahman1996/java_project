package day18_FileIO;

import java.io.File;


public class CreateFileOrDirectory {

	public static void main(String[] args) {
		
		/*
		//create file in project folder
		
		File dir = new File("Exp file");
		
		dir.mkdir();
		*/

		/*
		//create dir in different location
		
				File dir = new File("C:/Users/SQA/OneDrive/Desktop/Expfile");
				
				dir.mkdir();
				
				
				// to view newly created directory
				
				String dirLocation = dir.getAbsolutePath();
				
				System.out.println(dirLocation);
				
				// to know directory name
				
				System.out.println(dir.getName());
				
				//dir.delete();  // directory deleted
				
				// to get dir deleted message
				
				if(dir.delete()) {
					
					//System.out.println("Directory is deleted");
					System.out.println(dir.getName()+ "Directory is deleted");
				}
		
		*/
		
		//create dir in project folder
		
				File dir = new File("Exp file");
				
				dir.mkdir();
				
				String path= dir.getAbsolutePath();
				
		
		//create file in project inside folder
				
				//Approach 1 
		
		//File file1 = new File("C:/Users/SQA/OneDrive/Desktop/JAVA/learningJava/Exp file/Student.txt");
		//File file2 = new File("C:/Users/SQA/OneDrive/Desktop/JAVA/learningJava/Exp file/Teacher.txt");
		
				
				// Approach 2 > more easier
				
				File file1 = new File(path + "/Student.txt");
				File file2 = new File(path + "/Teacher.txt");
		try {
			
			file1.createNewFile();
			file2.createNewFile();
			System.out.println("File has been created");
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
		

	}

}
