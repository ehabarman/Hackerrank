// Date 30-9-2018

package Algorithms.Sorting.easy;

import java.util.*;

public class FindTheMaiden {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n =s.nextInt();
        int [] arr = new int[n];

        for(int i=0;i<n;i++)
            arr[i]=s.nextInt();
        Arrays.sort(arr);
        System.out.println(arr[n/2]);

        s.close();
    }
}