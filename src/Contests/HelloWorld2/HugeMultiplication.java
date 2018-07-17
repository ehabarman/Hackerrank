//Date 17-7-2018
package Contests.HelloWorld2;

import java.util.Scanner;

public class HugeMultiplication {
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		long result = 1;
		long mod = 1000000007;
		
		while(n-->0)
			result = (result * s.nextInt()) % mod;
		
		System.out.println(result);
		s.close();
    }
}