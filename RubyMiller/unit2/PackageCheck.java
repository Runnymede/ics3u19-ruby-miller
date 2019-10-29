package miller.unit2;

import java.util.Scanner;

/**PackageCheck.java
 * This program determines if a package is accepted based on its weight and volume
 * October 15, 2019
 * @author Ruby Miller
 */

public class PackageCheck {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Inputting the weight and dimensions of the package
		Scanner sc = new Scanner(System.in);
		System.out.println("How much does your package weigh in kilograms?");
		int weight = sc.nextInt();
		
		System.out.println("What is the length of your package in centimetres?");
		double length = sc.nextDouble();
		System.out.println("What is the width of your package in centimetres?");
		double width = sc.nextDouble();
		System.out.println("What is the height of your package in centimetres?");
		double height = sc.nextDouble();
		
		//Calculating the volume of the package
		double volume = length*width*height;
		
		//Determining if the delivery service accepts the package
		if (weight > 27 && volume > 1000000)
		{
			System.out.println("Sorry, your package is too heavy and too large, we can't accept it.");
		}
		else if (volume > 1000000)
		{
			System.out.println("Sorry, your package is too large, we can't accept it.");
		}
		else if (weight > 27)
		{
			System.out.println("Sorry, your package is too heavy, we can't accept it.");
		}
		else
		{
			System.out.println("Your package has been accepted!");
		}
		
	}

}
