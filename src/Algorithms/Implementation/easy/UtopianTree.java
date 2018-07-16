//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class UtopianTree {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();

		while(t-->0)
		{
			int cycles = s.nextInt();
			long sum =1;
			
			sum+= 2*(Math.pow(2,cycles/2)-1);

			if(cycles%2==1)
				sum*=2;
			
			System.out.println(sum);
		}
		
		s.close();
	}
}
