package Contests.HelloWorld2;
//Date 17-7-2018
import java.util.Scanner;

public class Fibonacci1 {

	public static void main(String[] args) {
		long [] ar = new long[100000]; 
		Scanner input = new Scanner(System.in);
		int t = input.nextInt(), n;
		ar[1] = ar[0] = 1;
		for (int i=2;i<100000;i++) {
			ar[i] = (ar[i-1] + ar[i-2]) % 1000000007;
		}		

		for (int i=0;i<t;i++) {
			n = input.nextInt();
			System.out.println(ar[n]);
		}
		input.close();
	}
}
