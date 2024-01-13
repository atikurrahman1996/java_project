package day2_ConditionalStatements;

public class BreakANDContinueStatement {

	public static void main(String[] args) {
		/*

		for (int i = 1; i <= 100; i++) {

			if (i == 10) {
				break;
			}

			System.out.println(i);    // output > 1, 2, ....9
		}
		*/

		for (int i = 1; i <= 100; i=i+2) {

			if (i == 10) {
				break;
			}

			System.out.println(i);     // output> 1, 3, 5,7, ......99
		}
		
		
		
		//Continue Statement
		
		
		for (int i = 1; i <=20; i++) {

			if (i == 10) {
				continue;
			}

			System.out.println(i);     // output> 1,2,3,...9, 11, 12, 13, .....20
		}
		
		
		// increment 3
		
		for (int i = 1; i <=10; i=i+3) {

			if (i == 10) {
				continue;
			}

			System.out.println(i);     // output> 1,4,7
		}

	}

}
