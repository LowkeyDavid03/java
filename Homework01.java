package hw01;

import java.util.*;

public class Homework01 {
	
	/**
	 * Name:        David Alvarado
	 * CIN:         401439516
	 * Course:      CS 2012
	 * Section:     31315
	 * Description: In this class we are going over Two Dimensional Arrays
	 */

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the dimensions of the array (row col): ");
	
		int rows = input.nextInt();
		int columns = input.nextInt();

		int[][] table = create2DArray(rows, columns);
		
		System.out.println("");
		System.out.println("Display Array: ");
		System.out.println("");
		

		print2DArray(table);
		
		
		System.out.println("");
		System.out.println("Table Statistics: ");
		System.out.println("");
		
		
		System.out.println("Sum of table: " + sum2DArray(table));
		System.out.printf("Average of table: " + "%.2f", average2DArray(table));
		
		
		System.out.println("");
		sumAndAverageOfRows(table);
		System.out.println("");
		sumAndAverageOfColumns(table);
		System.out.println("");

		
		highestAverageRow(table);
		highestAverageColumn(table);
		
		
		System.out.println("");

		lowestAverageRow(table);
		lowestAverageColumn(table);


		input.close();

	}

	public static void print2DArray(int[][] table) {
		for(int row = 0 ; row < table.length ; row++) {
			for(int col = 0 ; col < table[row].length ; col++) {
				System.out.print(table[row][col] + " ");
			}
			System.out.println();
		}
	}

	public static int[][] create2DArray(int nRows, int nCols) {
		int[][] table = new int[nRows][nCols];

		Random rand = new Random();
		
		for(int row = 0 ; row < table.length ; row++) {
			for(int col = 0 ; col < table[row].length ; col++) {
				table[row][col] = rand.nextInt(99);
			}
		}

		return table;
	}
	
	public static int sum2DArray(int[][] array) {
	    int sum = 0;
	    for (int row = 0; row < array.length; row++) {
	        for (int col = 0; col < array[row].length; col++) {
	            sum += array[row][col];
	        }
	    }
	    return sum;
	}
	
	public static double average2DArray(int[][] array) {
	    double sum = 0;
	    double count = 0;
	    for (int row = 0; row < array.length; row++) {
	        for (int col = 0; col < array[row].length; col++) {
	            sum += array[row][col];
	            count++;
	        }
	    }
	    return sum / count;
	}
	
	public static void sumAndAverageOfRows(int[][] array) {
	    for (int row = 0; row < array.length; row++) {
	        int rowSum = 0;
	        for (int col = 0; col < array[row].length; col++) {
	            rowSum += array[row][col];
	        }
	        double rowAvg = (double) rowSum / array.length;
			System.out.println("");
	        System.out.printf("Row " + (row + 1) + " sum: " + rowSum);
			System.out.println("");
	        System.out.printf("Row " + (row + 1) + " Average: " + "%.2f", rowAvg);
			System.out.println("");
	    }
	}
	
	public static void sumAndAverageOfColumns(int[][] array) {
	   	    for (int col = 0; col < array[0].length; col++) {
	        int colSum = 0;
	        for (int row = 0; row < array.length; row++) {
	            colSum += array[row][col];
	        }
	        double colAvg = (double) colSum / array.length;
			System.out.println("");
	        System.out.printf("Col " + (col + 1) + " sum: " + colSum);
			System.out.println("");
	        System.out.printf("Col " + (col + 1) +" Average: " + "%.2f", colAvg);
			System.out.println("");

	    }
	}
	
	public static void highestAverageRow(int[][] array) {
		int maxRow = 0;
		double indexOfMaxRow = 0;
		for(int row = 0; row < array.length; row++) {
			int sum = 0;
			for(int column = 0; column < array[row].length; column++) {
				sum += array[row][column];
			}
			double average = (double)sum / array[row].length;
			if(average > indexOfMaxRow) {
				indexOfMaxRow = average;
				maxRow = row;
			}
		}
		System.out.println("");
		System.out.printf("Highest Avg Row: " + (maxRow + 1));
	}
	
	public static void highestAverageColumn(int[][] array) {
		int maxColumn = 0;
		double indexOfMaxColumn = 0;
		for(int column = 0; column < array[0].length; column++) {
			int sum = 0;
			for(int row = 0; row < array.length; row++) {
				sum += array[row][column];
			}
			double average = (double)sum / array.length;
			if(average > indexOfMaxColumn) {
				indexOfMaxColumn = average;
				maxColumn = column;
			}
		}
		System.out.println("");
		System.out.println("Highest Avg column: " + (maxColumn + 1));
	}
	
	public static void lowestAverageRow(int[][] array) {
	    int minRow = 0;
	    double indexOfMinRow = Double.MAX_VALUE;
	    for (int row = 0; row < array.length; row++) {
	        int sum = 0;
	        for (int col = 0; col < array[row].length; col++) {
	            sum += array[row][col];
	        }
	        double average = (double)sum / array[row].length;
	        if (average < indexOfMinRow) {
	        	indexOfMinRow = average;
	            minRow = row;
	        }
	    }
	    System.out.println("Lowest Avg Row: " + (minRow + 1));
	}
	
	public static void lowestAverageColumn(int[][] array) {
	    int minColumn = 0;
	    double indexOfMinColumn = Double.MAX_VALUE;
	    for (int column = 0; column < array[0].length; column++) {
	        int sum = 0;
	        for (int row = 0; row < array.length; row++) {
	            sum += array[row][column];
	        }
	        double average = (double)sum / array.length;
	        if (average < indexOfMinColumn) {
	        	indexOfMinColumn = average;
	        	minColumn = column;
	        }
	    }
	    System.out.println("Lowest Avg Col: " + (minColumn + 1));
	}
}