//Date 9-7-2018

package Java_Proficiency.easy;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaBigInteger {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		BigInteger a = new BigInteger(s.nextLine());
		BigInteger b = new BigInteger(s.nextLine());
		System.out.println(a.add(b));
		System.out.println(a.multiply(b));
		s.close();
	}
}
