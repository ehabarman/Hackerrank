//Date 25-9-2018

package Algorithms.Greedy.easy;

import java.util.Arrays;
import java.util.Scanner;

public class LuckBalance {


    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int k = in.nextInt();
        int luck [] = new int[n];
        int temp1, temp2, count = 0;
        int sumOfLuck = 0;
        for (int i=0;i<n;i++) {
            temp1 = in.nextInt();
            temp2 = in.nextInt();
            if (temp2 == 1) {
                luck[count++] = temp1;
            }
            sumOfLuck+= temp1;
        }
        if (k >= count) {
            System.out.println(sumOfLuck);
            return;
        }
        int [] newLuck = new int[count];
        for (int i=0;i<count;i++)
            newLuck[i] = luck[i];

        Arrays.sort(newLuck);
        int i = 0;
        while (k != count) {
            sumOfLuck-= (newLuck[i++] * 2);
            count--;
        }
        System.out.println(sumOfLuck);

    }
}
