package miller.unit2;

import java.util.Scanner;

/**PowersTableBonus.java <p>
 * This program prints a table of powers. <br>
 * The rows are the base number, which starts at 1, and gets 1 larger each row down. The base goes up to whatever number the user inputed. <br>
 * The columns are the exponents/powers. It also starts at 1,and goes up to whatever number the user inputed. Each column to the right, the exponent goes up by 1. <p>
 * November 12, 2019
 * @author Ruby Miller
 */

public class PowersTableBonus {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Inputing how high the base and powers go up to
		Scanner sc = new Scanner(System.in);
		System.out.println("What is the highest base in the table?");
		int baseInput = sc.nextInt();
		System.out.println("What is the highest exponent in the table?");
		int powerInput = sc.nextInt();

		//Printing the first row of the column
		for (int columns = 1; columns <= powerInput; columns++) //This loop will repeat until columns gets to the inputed highest exponent/power
		{
			System.out.printf("%-10s", "x^" + columns); //This formats the top row into a table
		}

		//Printing the rest of the rows and columns
		for (int base = 1; base <= baseInput; base++) //This loop repeats until base gets to the inputed highest base
		{
			System.out.println();
			for (int power = 1; power <= powerInput; power++) //This loop repeats until power gets to the inputed highest power
			{
				int value = (int)Math.pow(base, power); //Calculates the value of base^power
				System.out.printf("%-10s", value); //Prints the data in a table under the formatted top row

			}
		}
		

	}

}
