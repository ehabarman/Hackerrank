package Ten_Days_Of_Statistics.Day0;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MeanMedianMode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        Arrays.sort(arr);

        System.out.println(mean(arr));
        System.out.println(median(arr));
        System.out.println(mode(arr));

    }

    public static double mean(int[] arr) {
        double sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        return sum / n;
    }

    public static double median(int[] arr) {
        double median;
        if (arr.length % 2 == 0)
            median = ((double) arr[arr.length / 2] + (double) arr[arr.length / 2 - 1]) / 2;
        else
            median = (double) arr[arr.length / 2];
        return median;
    }

    public static int mode(int[] arr) {
        HashMap<Integer, Integer> freqs = new HashMap<Integer, Integer>();

        for (int val : arr) {
            Integer freq = freqs.get(val);
            freqs.put(val, (freq == null ? 1 : freq + 1));
        }

        int mode = 0;
        int maxFreq = 0;

        for (Map.Entry<Integer, Integer> entry : freqs.entrySet()) {
            int freq = entry.getValue();
            if (freq > maxFreq) {
                maxFreq = freq;
                mode = entry.getKey();
            }
            else if (freq == maxFreq) {
                if (mode > entry.getKey())
                    mode = entry.getKey();
            }
        }

        return mode;
    }
}
