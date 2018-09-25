//Date 25-9-2018

package Algorithms.Greedy.easy;

import java.util.Arrays;
import java.util.Scanner;

public class MinimumAbsoluteDifferenceInAnArray {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int [] arr = new int [n];
        for(int i=0;i<n;i++)
            arr[i]=in.nextInt();

        Arrays.sort(arr);
        int min = Math.abs(arr[0]- arr[1]);
        int current;
        for(int i=1;i<n-1;i++){
            current = Math.abs(arr[i]-arr[i+1]);
            min = ( min > current) ? current : min ;
            if( min == 0)
                break;
        }
        System.out.println(min);
    }

}
