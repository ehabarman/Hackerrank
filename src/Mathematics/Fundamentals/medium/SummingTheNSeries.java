//Date 17-7-2018
package Mathematics.Fundamentals.medium;

import java.math.BigInteger;
import java.util.Scanner;

public class SummingTheNSeries {

	public static void main(String[] args) {
	       Scanner in = new Scanner(System.in);
	        int t = in.nextInt();
	        while (t > 0) 
	            {
	                
	                BigInteger n = new BigInteger(in.next());
	                n = n.pow(2);
	                System.out.println(n.mod(new BigInteger("1000000007")));
	                t--;   
	            }
	        in.close();	
	    }
}
