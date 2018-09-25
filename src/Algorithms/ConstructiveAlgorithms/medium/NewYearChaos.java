package Algorithms.ConstructiveAlgorithms.medium;

import java.util.*;

public class NewYearChaos {

    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int [] ar = new int[n];
            for (int i=0;i<n;i++)
                ar[i] = in.nextInt();
            findResult(ar);
        }
        in.close();

    }

    public static void findResult(int [] ar) {
        int numOfBribes = 0;
        int temp;
        for (int i=ar.length-1;i>=2;i--) {
            if (ar[i] == i+1) {
                //correct
            }else if (ar[i-1] == i+1) {
                temp = ar[i-1];
                ar[i-1] = ar[i];
                ar[i] = temp;

                numOfBribes++;
            }else if (ar[i-2] == i+1) {
                temp = ar[i-2];
                ar[i-2] = ar[i-1];
                ar[i-1] = temp;

                temp = ar[i-1];
                ar[i-1] = ar[i];
                ar[i] = temp;

                numOfBribes+= 2;
            }else {
                System.out.println("Too chaotic");
                return;
            }
        }
        if (ar[0] != 1)
            numOfBribes+= 1;
        System.out.println(numOfBribes);
    }

}
