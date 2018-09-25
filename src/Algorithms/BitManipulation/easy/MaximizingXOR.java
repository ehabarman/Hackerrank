//Date  25-9-2018

package Algorithms.BitManipulation.easy;

import java.util.Scanner;

public class MaximizingXOR {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int l = s.nextInt();
        int r = s.nextInt();
        int max =0;
        for(int i = l; i < r ;i++)
            for(int j = i+1;j<=r;j++)
                max = Math.max(i^j,max);

        System.out.println(max);
        s.close();
    }
}
