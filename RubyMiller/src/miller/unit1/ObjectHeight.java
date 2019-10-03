package miller.unit1;

import java.util.Scanner;

/**ObjectHeight.java
 * This program outputs the digits of a number between 0 and 999
 * September 23, 2019
 * @author Ruby Miller
 */

public class ObjectHeight {
	
	/**Entry point to this program
	 * 
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Inputting the time
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a time less that 4.5 seconds");
		double objectTime=sc.nextDouble();
		
		//Calculating the object's height
		double objectHeight=100-2.9*objectTime*objectTime;
		System.out.println("The height of the object is: "+objectHeight+" metres.");
		
	}

}
