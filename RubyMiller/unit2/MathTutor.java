package miller.unit2;

import java.util.Scanner;

/**MathTutor.java <p>
 * This program generates pseudorandom numbers and a pseudorandom operator, asks the user to answer the math question, and determines if it is correct. <p>
 * October 15, 2019
 * @author Ruby Miller
 */

public class MathTutor {

	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {

		//Generating random numbers and operator
		int counter = 1;
		Scanner sc = new Scanner(System.in);
		while(counter>0)
		{
			int number1 = (int)(Math.random()*10) + 1;
			int number2 = (int)(Math.random()*10) + 1;
			int operatorNumber = (int)(Math.random()*4); //Each number (0-3) will represent an operator
			String operator;
			double answer;
			if (operatorNumber == 0)
			{
				operator = "+";
				answer = number1 + number2;
			}
			else if (operatorNumber == 1)
			{
				operator = "-";
				answer = number1 - number2;
			}
			else if (operatorNumber == 2)
			{
				operator = "*";
				answer = number1 * number2;
			}
			else
			{
				operator = "/";
				answer = (double)number1 / (double)number2;
			}

			//Asking user for answer
			System.out.println ("What is " + number1 + operator + number2 + "?");
			double guess = sc.nextDouble();

			//Determining if the user was correct
			if (guess == answer)
			{
				System.out.println("Correct!");
			}
			else
			{
				System.out.println("Incorrect.");
				System.out.println("The correct answer is " + answer + ".");
			}
		}

	}

}