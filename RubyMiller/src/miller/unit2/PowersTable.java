package miller.unit2;

/**PowersTable.java <p>
 * This program prints a table of powers. <br>
 * The rows are the base number, which starts at 1, and gets 1 larger each row down. The base goes up to 6. <br>
 * The columns are the exponents/powers. It also starts at 1,and goes up to 5. Each column to the right, the exponent goes up by 1. <br>
 * November 12, 2019
 * @author Ruby Miller
 */

public class PowersTable {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Printing the first row of the column
		System.out.printf("%-9s %-9s %-9s %-9s %-9s", "x^1", "x^2", "x^3", "x^4", "x^5\n");

		for (int base = 1; base <= 6; base++)
		{
			System.out.println();
			for (int power = 1; power <= 5; power++)
			{
				int value = (int)Math.pow(base, power);
				System.out.printf("%-10s", value);
				
			}
		}

	}

}
