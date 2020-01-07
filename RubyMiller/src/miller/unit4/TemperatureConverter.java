package miller.unit4;

import java.util.Scanner;

/**PrintSignature.java <p>
 * This program asks the user if the want to convert from fahrenheit to celsius or from celsius to fahrenheit. <br>
 * The user will then input the value in fahrenheit or celsius, then either the fahrenheitToCelcius or celsiusToFahrenheit method will be called. <br>
 * The inputted value will be used to convert the temperature in one of the other methods. <br>
 * Once the temperature is converted, it will be printed in the main method. <br>
 * The user will be asked if they want to convert another temperature, which will make a do-while loop repeat again, or stop. <p>
 * December 18, 2019
 * @author Ruby Miller
 */

public class TemperatureConverter {

	/**
	 * This method allows the user to enter the tremperature, and prints all of the calculations. <br>
	 * @param args - the array of strings that stores arguments passed by the command line.
	*/
	public static void main(String[] args) {
		String repeat; //Declaring the variable repeat, which determines if the user wants to convert another temperature

		do {
			System.out.println("Do you want to convert from fahrenheit to celcius (1) or celcius to fahrenheit? (2) (enter 1 or 2)");
			Scanner sc = new Scanner(System.in);
			if (sc.nextInt() == 1){ //If the user wants to convert from fahrenheit to celsius
				System.out.println("What is the temperature in fahrenheit?");
				double fahrenheit = sc.nextDouble();
				System.out.println("The value of " + fahrenheit + "°F in celsius is " + (fahrenheitToCelsius(fahrenheit)) + "°C");  
			}						//The fahrenheitToCelsius method is called, using the fahrenheit value the user entered as the parameter f2
			else { //If the user wants to convert celsius to fahrenheit
				System.out.println("What is the temperature in celsius?");
				double celsius = sc.nextDouble();
				System.out.println("The value of " + celsius + "°C in fahrenheit is " + (celsiusToFahrenheit(celsius)) + "°F");
			}						//The CelsiusToFahrenheit method is called, using the celsius value the user entered as the parameter c2
			System.out.println();
			System.out.println("Do you want to convert another temperature?");
			repeat = sc.next(); //If the user wants to convert anothner temperature, they will enter "yes", making the do-while loop repeat
		} while (repeat.equalsIgnoreCase("yes"));
	}

	/**
	 * This method finds the temperature in celsius from the temperature in fahrenheit. <br>
	 * @param f2 - the given number in fahrenheit. <br>
	 * @return the temperature in celsius.
	*/
	public static double fahrenheitToCelsius(double f2) {
		return ((f2 - 32) * 5 / 9); //This takes the inputted number in fahrenheit and converts it to celsius
	}

	/**
	 * This method finds the temperature in fahrenheit from the temperature in celsius. <br>
	 * @param c2 - the given number in celsius. <br>
	 * @return the temperature in fahrenheit.
	*/
	public static double celsiusToFahrenheit(double c2) {
		return (c2 * 9 / 5 + 32); //This takes the inputed number in celsius and converts it to fahrenheit
	}
}
