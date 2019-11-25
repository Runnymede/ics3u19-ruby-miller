package miller.unit2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**investment.java <p>
 * This program calculates how many years it will  take to make a $2500 investment worth at least $5000 when compounded annually at 7.5% <p>
 * It first calculates the interest over 1 year, and uses a loop to repeat until the value is 5000 <p>
 * October 29, 2019
 * @author Ruby Miller
 */

public class Investment {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Declaring and assigning variables
		double money = 2500;
		double interest = 1.075; // 1, so the initial money value doesn't have to be added later
		int years = 0;
		
		//Calculating the total amount of money after 1 year, looped for multiple years until it hits $5000
		while (money < 5000)
		{
		money = money * interest; // The variable years will add one to its self each time the loop is repeated,
		years = years + 1;   	  // meaning the value of years when the loop stops is the amount of years it took to get to $5000
		}
		
		//Outputting the information
		DecimalFormat formatMoney = new DecimalFormat("$#,###.00");
		System.out.println("It will take " + years + " years for a $2500 investment to be worth " + formatMoney.format(money));
		
		
		
		
	}

}
