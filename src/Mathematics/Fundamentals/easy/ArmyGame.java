//Date 17-7-2018
package Mathematics.Fundamentals.easy;

import java.util.Scanner;

public class ArmyGame {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double n = s.nextInt();
		double m = s.nextInt();
		
		if ( n == 1)
			System.out.println((long)Math.ceil(m/2));
		else if (m==1)
			System.out.println((long)Math.ceil(n/2));
		else
			System.out.println((long)(Math.ceil(n/2)*Math.ceil(m/2)));
		s.close();
	}
}
