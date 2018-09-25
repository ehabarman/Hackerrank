//Date 25-9-2018

package Algorithms.BitManipulation.easy;

import java.util.Scanner;

public class Flippingbits {

    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        int t = s.nextInt();

        while(t-->0){

            long n = s.nextLong();
            System.out.println( n^0x00000000ffffffffL );
        }

        s.close();
    }

}
