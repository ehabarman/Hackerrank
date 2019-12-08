package Ten_Days_Of_Statistics.Day5;

import java.util.Scanner;

public class PoissonDistributionII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double x = s.nextDouble();
        double y = s.nextDouble();

        double a = 160 + 40 * (x + Math.pow(x, 2));
        double b = 128 + 40 * (y + Math.pow(y, 2));

        System.out.println(round(a, 3));
        System.out.println(round(b, 3));
    }

    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
