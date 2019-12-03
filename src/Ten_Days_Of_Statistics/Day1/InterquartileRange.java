package Ten_Days_Of_Statistics.Day1;

import java.util.Arrays;
import java.util.Scanner;

public class InterquartileRange {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();

        int total = 0;
        int[] freq = new int[n];
        int[] num = new int[n];

        for (int i = 0; i < n; i++)
            num[i] = s.nextInt();
        for (int i = 0; i < n; i++) {
            freq[i] = s.nextInt();
            total += freq[i];
        }


        int[] arr = new int[total];
        int j = 0;
        for (int i = 0; i < num.length; i++) {
            total = freq[i];
            while (total-- > 0)
                arr[j++] = num[i];
        }

        Arrays.sort(arr);


        double[] q = quartiles(arr);
        double range = (q[2] - q[0]);
        System.out.println(Math.round(range * 10) / 10.0);
    }

    public static double[] quartiles(int[] arr) {
        double[] q = new double[3];
        q[1] = median(arr);

        if (arr.length % 2 == 0) {
            q[0] = median(Arrays.copyOfRange(arr, 0, arr.length / 2));
            q[2] = median(Arrays.copyOfRange(arr, arr.length / 2, arr.length));
        } else {
            q[0] = median(Arrays.copyOfRange(arr, 0, arr.length / 2));
            q[2] = median(Arrays.copyOfRange(arr, arr.length / 2 + 1, arr.length));
        }

        return q;
    }

    public static double median(int[] arr) {
        double median;
        if (arr.length % 2 == 0)
            median = ((double) arr[arr.length / 2] + (double) arr[arr.length / 2 - 1]) / 2;
        else
            median = (double) arr[arr.length / 2];
        return median;
    }

}
