package miller.unit2;

import java.util.Scanner;
import java.text.DecimalFormat;

/**Printing.java <p>
 * This program takes the amount of copies, and gives the price per copy, and the total cost <p>
 * October 3, 2019
 * @author Ruby Miller
 */

public class Printing {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Inputting the amount of copies
		Scanner sc = new Scanner(System.in);
		System.out.println("How many copies do you want to print?");
		int copies = sc.nextInt();
		
		//Determining the price per copy
		Double pricePerCopy;
		
		if (copies > 1000)
		{
			pricePerCopy = 0.25;
		}
		else if (copies >= 750)
		{
			pricePerCopy = 0.26;
		}
		else if (copies >= 500)
		{
			pricePerCopy = 0.27;
		}
		else if (copies >= 100)
		{
			pricePerCopy = 0.28;
		}
		else
		{
			pricePerCopy = 0.30;
		}
		
		//Determining the total cost
		Double totalCost = copies*pricePerCopy;
		
		//Outputting the information
		DecimalFormat cost = new DecimalFormat("$0.00");
		System.out.println("The price per copy is "  + cost.format(pricePerCopy));
		System.out.println("The total cost is " + cost.format(totalCost));
		
	}

}
