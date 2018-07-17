//Date 17-7-2018
package Mathematics.Fundamentals.easy;

import java.util.Scanner;

public class LeonardoPrimeFactors {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int q = s.nextInt();
		int[] prime = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
	  	while (q-- > 0) {
	    	long n = s.nextLong();
	    	int count = 0;
	     	long product = 1;
	     	for (int i : prime) {
	     		product *= i;
	            if (product <= n) 
	                count++;      
	        }
	        System.out.println(count);
	        }
	    s.close();  
	}
}
