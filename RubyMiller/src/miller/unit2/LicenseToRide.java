package miller.unit2;

import java.text.DecimalFormat;

/**LicenseToRide.java <p>
 * This program takes the digits of s 4-digit license plate, and adds them together, if the sum is 34 or more, it adds 1 to a counter <br>
 * It does this using 4 nested for loops, each one representing a digit (eg. ones, hundreds, etc.) <br>
 * Each time the ones loop repeats, the digit decreases by 1. Every 10 time the loop repeats, the tens repeats once, this goes the same way for the hundreds and thousands. <br>
 * After the loops, it finds the percentage of combinations of 4 digit numbers where the sum is 34 or greater. <br>
 * It does this by using the counter and dividing it by 9999 (the largest possible combination), then multiplying it by 100. <p>
 * November 14, 2019
 * @author Ruby Miller
 */

public class LicenseToRide {

	/**
	 * Entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {

		//Declaring variables
		double counter = 0;
		double percent;
		
		//Calculating how many 4 digit numbers will equal 34 of more
		for (int thousands = 9; thousands >= 0; thousands--)
		{
			for (int hundreds = 9; hundreds >= 0; hundreds--)
			{
				for (int tens = 9; tens >= 0; tens--)
				{
					for (int ones = 9; ones >= 0; ones--) //This loop will repeat 10 times, then the tens loop will run once
					{
						int sum = ones + tens + hundreds + thousands; //Adds the 4 digits
						if (sum >= 34) //Tests is the sum of the 4 digits i 34 or above
						{
							counter = counter + 1; //Every time the sum is 34 or over, it will add one to the counter
						}
						
					}
				}
			}
		}
		percent = ((counter/9999)*100); //Finds the percentage
		System.out.println(percent + "% of 4 digit license plates' digits add up to 34 or more.");
	}

}
