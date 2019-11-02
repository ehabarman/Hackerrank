package Algorithms.Search.easy;

import java.util.*;

public class IceCreamParlor {

    static int[] iceCreamParlor(int m, int[] arr) {
        int[] cost = new int[10001];
        int currentIndex;
        int[] result = new int[2];
        for (int i = 0; i < arr.length; i++) {
            if (m - arr[i] <= 0)
                continue;
            if (cost[m - arr[i]] != 0) {
                result[0] = cost[m - arr[i]];
                result[1] = i + 1;
            } else if (cost[arr[i]] == 0) {
                cost[arr[i]] = i + 1;
            }

        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        int t = scanner.nextInt();


        for (int tItr = 0; tItr < t; tItr++) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[] arr = new int[n];

            for (int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

            int[] result = iceCreamParlor(m, arr);

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);


                if (i != result.length - 1) {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
        scanner.close();
    }
}
