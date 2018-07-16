//Date 9-7-2018
package Java_Proficiency.easy;

import java.math.BigInteger;
import java.util.Scanner;

public class JavaPrimalityTest {

	public static void main(String[]args){
		Scanner cin=new Scanner(System.in);
		BigInteger n=cin.nextBigInteger();
		System.out.println(n.isProbablePrime(100) ? "prime" : "not prime");
		cin.close();
	}

}
