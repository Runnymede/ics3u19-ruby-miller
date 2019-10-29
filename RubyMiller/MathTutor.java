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
		// TODO Auto-generated method stub

		//Generating random numbers and operator
		Scanner sc = new Scanner(System.in);
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
			answer = number1 / number2;
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
		}
		
	}

}
