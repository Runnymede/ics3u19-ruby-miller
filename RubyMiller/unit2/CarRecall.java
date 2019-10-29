package miller.unit2;

import java.util.Scanner;

/**CarRecall.java <p>
 * This program determines if a car is defective based on its model number <p>
 * October 3, 2019
 * @author Ruby Miller
 */

public class CarRecall {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Inputting the car's model number
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the car's model number");
		int modelNumber = sc.nextInt();
		
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
		
	}

}
