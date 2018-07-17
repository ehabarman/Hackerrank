package Contests.HelloWorld2;
//Date 17-7-2018
import java.util.Scanner;

public class BinaryNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int com = (int) Math.pow(2, n);
		for (int i=0;i<com;i++) {
		     StringBuilder result = new StringBuilder(Integer.toBinaryString(i));
		     for(int j = result.length(); j<n; j++) {
		         System.out.print(0);
		     }
		        
		     System.out.println(result);
			 input.close();
		}
	}
}
