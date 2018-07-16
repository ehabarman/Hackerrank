//Date 14-7-2018
package Algorithms.Implementation.medium;

import java.util.*;
import java.math.*;

public class ExtraLongFactorial {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        long first = System.currentTimeMillis();
        BigInteger factorial = BigInteger.ONE;
        while (n>1){
            factorial = factorial.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println(factorial);
        System.out.println(System.currentTimeMillis()-first);
        s.close();
    }
}