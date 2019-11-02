package Algorithms.Search.easy;

import java.util.*;

public class SherlockAndArray {

    private static boolean isBalanced(int[] arr, int n) {
        int rightSum = 0;
        for (int i = 0; i < n; i++)
            rightSum += arr[i];
        int leftSum = 0;

        for (int i = 0; i < n; i++) {

            if (rightSum - arr[i] == leftSum)
                return true;

            rightSum -= arr[i];
            leftSum += arr[i];
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int t = s.nextInt();
        int n, i;
        int[] arr = new int[100000];

        while (t-- > 0) {
            n = s.nextInt();
            for (i = 0; i < n; i++)
                arr[i] = s.nextInt();

            if (isBalanced(arr, n)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }
}
