package day3_Array;

public class ArrayDemo {

	public static void main(String[] args) {
		
		     int number[] = new int [5];                // declare array with size starting index 0, and last index 4
		
				                                      //Initialize value / Storing value/ inserting value
				
			    number[0]=100;
				number[1]=200;   
				number[2]=300;
				number[3]=400;
				number[4]=500;  
				
				
				int len = number.length;
				
				System.out.println(len);
				
				
				int sum = number[0] + number[1]+ number[2] +number[3]+number[4];
				
				System.out.println(sum);
				
				
				
				System.out.println(number[2]);   //read specific value
				
				
				// read all values
				
				for(int i=0; i<number.length; i++)
				{
				
				System.out.println(number[i]);  // output 100,200,300,400,500,
				
				}
				
				

	}

}
