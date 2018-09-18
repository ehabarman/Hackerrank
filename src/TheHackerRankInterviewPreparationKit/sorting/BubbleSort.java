//Date 18-9-2018
package TheHackerRankInterviewPreparationKit.sorting;

import java.util.Scanner;

public class BubbleSort {

    private static int minimumSwaps(int[] a) {
        int temp, count =0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    count++;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = scanner.nextInt();
        int res = minimumSwaps(arr);
        System.out.println("Array is sorted in "+res+" swaps.");
        System.out.println("First Element: "+arr[0]);
        System.out.println("Last Element: "+arr[arr.length-1]);
        scanner.close();
    }
}
