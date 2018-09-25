//Date 25-9-2018

package Algorithms.Greedy.medium;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMin {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int [] ar = new int[n];
        for(int i=0;i<n;i++)
            ar[i] = in.nextInt();

        Arrays.sort(ar);
        int min = ar[k-1] - ar[0];
        int current;
        for (int i=1;i<n-k+1;i++) {
            current = ar[i+k-1] - ar[i];
            if(current<min)
            {
                min = current;
                if(min==0) break;
            }
        }
        System.out.println(min);
        in.close();
    }
}
