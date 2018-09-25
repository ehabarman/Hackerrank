//Date 25-9-2018

package Algorithms.Sorting.easy;

import java.util.Scanner;

public class RunningTimeOfAlgorithms {

    public static void insertionSortShifts(int arr[])
    {
        int n = arr.length;
        int count =0;
        for (int i=1; i<n; ++i)
        {
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key)
            {
                arr[j+1] = arr[j];
                j = j-1;
                count++;
            }
            arr[j+1] = key;
        }

        System.out.println(count);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSortShifts(ar);
    }

}
