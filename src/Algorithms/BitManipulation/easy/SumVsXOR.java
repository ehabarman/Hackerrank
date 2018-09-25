//Date 25-9-2018

package Algorithms.BitManipulation.easy;

import java.util.Scanner;

public class SumVsXOR {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        long n = s.nextLong();
        int unset_bits=0;
        while (n > 0)
        {
            if ((n & 1) == 0)
                unset_bits++;
            n=n>>1;
        }

        System.out.println(1l << unset_bits);
        s.close();
    }

}
