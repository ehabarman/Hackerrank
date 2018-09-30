//Date 30-9-2018

package Algorithms.Sorting.easy;

import java.io.*;
import java.util.*;

public class Quicksort1Partition {

    // Complete the quickSort function below.
    static int[] quickSort(int[] ar) {
        int temp=0;
        int pivot=ar[0];
        int pIndex=ar.length-1;
        for(int i=ar.length-1;i>=1;i--){
            if(ar[i]>=pivot){
                temp=ar[i];
                ar[i]=ar[pIndex];
                ar[pIndex]=temp;
                pIndex-=1;
            }
        }
        temp=ar[pIndex];
        ar[pIndex]=ar[0];
        ar[0]=temp;
        return ar;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
