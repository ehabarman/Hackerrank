package Ten_Days_Of_Statistics.Day0;

import java.util.Scanner;

public class WeightedMean {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int[] weights = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();
        for (int i = 0; i < n; i++)
            weights[i] = s.nextInt();

        double weightsSum = 0;
        for (int i = 0; i < n; i++)
            weightsSum += weights[i];

        double sum = 0;
        for (int i = 0; i < n; i++)
            sum += weights[i] * arr[i];

        double weightedMean = sum / weightsSum;
        System.out.println(round(weightedMean, 1));
    }

    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
