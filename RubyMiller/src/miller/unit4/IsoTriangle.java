package miller.unit4;

import java.util.Scanner;

/**PrintSignature.java <p>
 * This program prints an isosolece triangle based on  a inputed amount of rows/levels. <br>
 * eg. input: 3
 * output: <br>
 * (2 spaces) * <br>
 * (1 space) *** <br>
 * (no space) ***** <br>
 * The program uses 2 methods (to print a space or star), and the main method. <br>
 * December 17, 2019
 * @author Ruby Miller
 */

public class IsoTriangle {
	/**
	 * Entry point to this program
	 * @param args unused
	 */
	
	/**
	 * This method calls the other two the correct amount of times using for-loops
	*/
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the triangle");
		int n = sc.nextInt(); //Getting user input, n will be used as amount of lines (repeats in the first loop)
		for (int x = 0; x <= n; x++) { //This loop will repeat the inputed amount of times
			for (int i = 0; i < (n - x); i++) { //This calls the drawSpaces the correct amount of times, changing each row (changes each time n increases by 1)
				drawSpaces(i); //Calling the drawSpaces method
			}
			for (int j = 0; j < 1; j++) { //This loop will repeat only once
				for (int y = 1; y < (x * 2); y++) { //This calls drawStars the correct amount of times, which is x times 2 (x changes each line)
					drawStars(j); //Calling the drawStars method
				}
			}
			System.out.println(); //Going to the next line (enter), so all the stars don't appear on the same line
		}
	}
	
	/**
	 * This method prints a space when called
	*/
	public static void drawSpaces(int n) {
			System.out.print(" ");
	}
	
	/**
	 * This method is prints a star (*) when called
	*/
	public static void drawStars(int n) {
			System.out.print("*");
	}
}
