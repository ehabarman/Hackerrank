//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class SherlockAndSquares {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		while(t-->0) {

			int a = (int)Math.ceil(Math.sqrt(s.nextInt()));
			int b = (int)Math.sqrt(s.nextInt());
			System.out.println(b-a+1);			
		}		
		s.close();
	}

}
