//Date 12-7-2018
package Algorithms.Warmup.easy;

import java.util.Scanner;

public class Staircase {

	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       int n = s.nextInt();
	       s.close();
	       for(int i=0;i<n;i++)
	       {    
	           int spaces= n-1-i;
	           
	           for(int j=0;j<n;j++)
	               {
	               if(spaces>0)
	                   System.out.print(" ");
	               else
	                   System.out.print("#");
	               spaces--;
	           }
	           System.out.println();
	       }
	}
}
