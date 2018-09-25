//Date 25-9-2018

package Algorithms.BitManipulation.easy;

import java.util.Scanner;

public class LonelyInteger {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int range = 101;
        int n = in.nextInt();
        int [] ar = new int[n], hash = new int[range];

        for (int i=0;i<ar.length;i++) {
            ar[i] = in.nextInt();
            hash[ar[i]]++;
        }

        in.close();

        for (int i=0;i<hash.length;i++)
            if (hash[i] == 1) {
                System.out.println(i);
                break;
            }

    }
}
