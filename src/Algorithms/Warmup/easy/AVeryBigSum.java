//Date 12-7-2018
package Algorithms.Warmup.easy;

import java.util.Scanner;

public class AVeryBigSum {

	public static void main(String[] args) {
		
	    Scanner s = new Scanner(System.in);
	    long b = 0;
	    int n = s.nextInt();
	    for(int i=0;i<n;i++)
	    	b+=s.nextLong();
	    System.out.println(b);
	    s.close();
	}
}
