//Date 17-7-2018
package Mathematics.Fundamentals.easy;

import java.util.Scanner;

public class Handshake {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int t = s.nextInt();
		while(t-->0)
		{
			int n = s.nextInt();
			System.out.println((n-1)*n/2);
		}
		
		s.close();

	}

}
