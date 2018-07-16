//Date 12-7-2018
package Algorithms.Warmup.easy;

import java.util.Scanner;

public class DiagonalDifference {

	public static void main(String[] args) {
	      
		Scanner s = new Scanner(System.in);
	    int n = s.nextInt();
	    int [][]array = new int [n][n];
	    int d1=0;
	    int d2=0;
	    for(int i=0;i<n;i++)
	    	for(int j=0;j<n;j++)
	    		array[i][j]=s.nextInt();
	    for(int i=0;i<n;i++)
	        d1+=array[i][i];
	    for(int i=0;i<n;i++)
	        d2+=array[i][n-1-i];
	      
	     System.out.println(Math.abs(d1-d2));
	     s.close();
	      
	}
}
