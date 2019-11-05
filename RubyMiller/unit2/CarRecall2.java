package miller.unit2;

import java.util.Scanner;

/**CarRecall2.java <p>
 * This program determines if a car is defective based on its model number <br>
 * It allows the user to input as many model numbers as they want <p>
 * October 28, 2019
 * @author Ruby Miller
 */

public class CarRecall2 {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Inputting the car's model number
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the car's model number, or enter 0 to quit.");
		int modelNumber = sc.nextInt();
		while (modelNumber != 0) //will repeat until user inputs 0 for the model number
		{
			
		//Determining if the car is defective
		String defective;
		
		switch (modelNumber)
		{
		case 199:
		case 179:
		case 189:
		case 190:
		case 191:
		case 192:
		case 193:
		case 194:
		case 195:
		case 221:
		case 780: defective = "defective. It must be repaired.";
				  break;
		default:  defective = "not defective.";
				  break;
		}
		
		//Telling the user if the car is defective or not
		System.out.println("Your car is " + defective);
		
		//Inputting car's model number again
		System.out.println("Please enter the car's model number, or enter 0 to quit.");
		modelNumber = sc.nextInt();
		}
		System.out.println("Done!");
	}

}
