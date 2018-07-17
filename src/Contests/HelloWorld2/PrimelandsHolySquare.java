//Date 17-7-2018
package Contests.HelloWorld2;
import java.util.Scanner;
//Date 17-7-2018
public class PrimelandsHolySquare {

	public static void main(String[] args) {
	       Scanner input = new Scanner(System.in);
	        int t = input.nextInt();
	        for (int q=0;q<t;q++) {
	            int n = input.nextInt(), k = input.nextInt();
	            int [] primes = new int[n];
	            for (int i=0;i<n;i++) {
	                primes[i] = input.nextInt();
	            }
	            int num = 1;
	            boolean isNot = true;
	            while (k > 0) {
	                isNot = true;
	                for (int i=0;i<n;i++) {
	                    if (num % primes[i] == 0) {
	                        isNot = false;
	                        break; 
	                    }
	                }
	                if (isNot)
	                    k--;
	                num++;
	                
	                
	            }
	          System.out.println(num-1);

	        }
	        input.close();
	    }
}
