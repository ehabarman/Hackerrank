//Date 12-7-2018
package Algorithms.Warmup.easy;

import java.util.Scanner;

public class SimpleArraySum {

	 public static void main(String[] args) {
		 /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	     Scanner s = new Scanner(System.in);
	     int n=s.nextInt();
	     int sum=0;
	     for(int i=0;i<n;i++)
	     sum+=s.nextInt();
	     System.out.println(sum);
	     s.close();
	    }	
}
