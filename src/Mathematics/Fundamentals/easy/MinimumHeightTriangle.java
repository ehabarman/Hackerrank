//Date 16-7-2018
package Mathematics.Fundamentals.easy;

import java.util.Scanner;

public class MinimumHeightTriangle {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		Double base = s.nextDouble();
		Double area = s.nextDouble();
		
		System.out.println((long)Math.ceil(area*2/base));
		
		s.close();
	}
}
