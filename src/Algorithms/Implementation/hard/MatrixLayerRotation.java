//Date 14-7-2018
package Algorithms.Implementation.hard;

import java.util.Scanner;

public class MatrixLayerRotation {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int rot = s.nextInt();
		int [][] arr = new int[rows][cols];
		int [][] result = new int[rows][cols];
	
		for (int i = 0; i < rows; i++) 
		       for (int j = 0; j < cols; j++) 
		    	   arr[i][j]=s.nextInt();
		        	
		rows--;
		cols--;
		for (int i = 0; i <= rows; i++) {
	        for (int j = 0; j <= cols; j++) {
	            int x = i < rows - i ? i : rows - i;
	            int y = j < cols - j ? j : cols - j;
	            int min = x < y ? x : y;
	            int maxRow = rows - min;
	            int maxCol = cols - min;
	            int parameter = (maxRow + maxCol) * 2 - min * 4;

	            int row = i;
	            int col = j;
	            for (int a = 0; a < rot%parameter; a++) {
	                if (col == min && row < maxRow) {
	                    row++;
	                }
	                else if (row == maxRow && col < maxCol) {
	                    col++;
	                }
	                else if (row > min && col == maxCol) {
	                    row--;
	                }
	                else if (row == min && col > min) {
	                    col--;
	                }
	            }
	            result[row][col] = arr[i][j];
	        }
	    }
		
		for (int i = 0; i <= rows; i++) {
	        for (int j = 0; j <= cols; j++) {
	            System.out.print(result[i][j]+" ");
	        }
	        System.out.println();
	    }

		s.close();
	}
}
