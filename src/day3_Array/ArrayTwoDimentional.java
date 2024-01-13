package day3_Array;

public class ArrayTwoDimentional {

	public static void main(String[] args) {
		
        int a[][]= new int [3][2];    // declare two dimensional array
		
		a[0][0]=100;     // initialize value 
		a[0][1]=200;
		
		a[1][0]=300;
		a[1][1]=400;
		
		a[2][0]=500;
		a[2][1]=600; 
		
		
		//int a[][]= { {100,200}, {300,400}, {500,600}};
		
		
		System.out.println("The number of raw: " +a.length);   //output raw 3 // using length function we can see size / length of array 
		
		System.out.println("The number of column: "+ a[0].length); // output column 2
		
		System.out.println(a[2][0]);    //read specific value 
		
		
		for(int i=0; i<a.length; i++) //outer lopp  // row
		{
			for (int j=0; j<a[i].length; j++) //inner loop 
			{
			
				System.out.println(a[i][j]);   //read all values 100.......600
		}
		
		
		

	}


	}

}
