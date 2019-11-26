package miller.unit3;

import java.util.Scanner;

/**TicTacToe.java <p>
 * This program 
 * November 26, 2019
 * @author Ruby Miller
 */

public class TicTacToe {
	
	/**
	 * Entry point to this program
	 * @param args unused
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Declaring variables and getting input from the user
		Scanner sc = new Scanner(System.in);
		char [][] grid = new char[3][3];
		int xRow;
		int xColumn;
		int oRow;
		int oColumn;;
		System.out.println("Player 1 is X, and player 2 is O.");
		System.out.println();
		//
		//		for (int row = 0; row < grid.length; row++)
		//		{
		//			for (int column = 0; row < grid[row].length; column++)
		//			{
		for(int i = 0; i  < 9; i++)
		{
			System.out.println("Player 1, which row do you want to place your X?");
			xRow = sc.nextInt() - 1;
			System.out.println("Which column?");
			xColumn = sc.nextInt() - 1;
			grid[xRow][xColumn] = 'X';

			System.out.println("Player 2, which row do you want to place your O?");
			oRow = sc.nextInt() - 1;
			System.out.println("Which column?");
			oColumn = sc.nextInt() - 1;
			grid[oRow][oColumn] = 'O';
		}
		System.out.println(grid[0][0] + grid[0][1] + grid[0][2]);
		System.out.println(grid[1][0] + grid[1][1] + grid[1][2]);
		System.out.println(grid[2][0] + grid[2][1] + grid[2][2]);

			//
			//			}
			//		}
		}
	}






