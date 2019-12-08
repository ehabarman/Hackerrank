package Ten_Days_Of_Statistics.Day5;

import java.util.Scanner;

public class NormalDistributionII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double mean = s.nextDouble();
        double sdev = s.nextDouble();
        double limit1 = s.nextDouble();
        double limit2 = s.nextDouble();
        System.out.println(round((1 - normal(limit1, mean, sdev)) * 100, 2));
        System.out.println(round((1 - normal(limit2, mean, sdev)) * 100, 2));
        System.out.println(round(normal(limit2, mean, sdev) * 100, 2));
    }

    public static double normal(double x, double mean, double sdev) {
        return .5 * (1 + erf((x - mean) / (sdev * Math.sqrt(2))));
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
