package Ten_Days_Of_Statistics.Day6;

import java.util.Scanner;

public class TheCentralLimitTheoremII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double max = s.nextDouble();
        double n = s.nextDouble();
        double mean = s.nextDouble();
        double std = s.nextDouble();

        double expectedWeight = n * mean;
        double expectedStd = Math.sqrt(n) * std;
        double result = cdf(max, expectedWeight, expectedStd);
        System.out.println(round(result, 4));
    }

    public static double cdf(double x, double mean, double std) {
        double Z = (x - mean) / std;
        return 0.5 * (1 + erf(Z / (Math.sqrt(2))));

    }

    public static double erf(double z) {
        double t = 1.0 / (1.0 + 0.5 * Math.abs(z));

        // use Horner's method
        double ans = 1 - t * Math.exp(-z * z - 1.26551223 +
                t * (1.00002368 +
                        t * (0.37409196 +
                                t * (0.09678418 +
                                        t * (-0.18628806 +
                                                t * (0.27886807 +
                                                        t * (-1.13520398 +
                                                                t * (1.48851587 +
                                                                        t * (-0.82215223 +
                                                                                t * (0.17087277
                                                                                ))))))))));
        if (z >= 0) return ans;
        else return -ans;
    }

    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
