//Date 25-9-2018

package Algorithms.BitManipulation.medium;

import java.util.Scanner;

public class XorSequence {

    public static long G(long x){
        long a = x % 8L;
        if(a == 0 || a == 1) return x;
        if(a == 2 || a == 3) return 2;
        if(a == 4 || a == 5) return x+2;
        if(a == 6 || a == 7) return 0;
        return 0;
    }

    public static void main(String[]args){

        Scanner s= new Scanner(System.in);
        int q = s.nextInt();
        while(q-->0){

            long l = s.nextLong();
            long r = s.nextLong();
            long ans = G(r)^G(l-1);
            System.out.println(ans);
        }
        s.close();
    }
}