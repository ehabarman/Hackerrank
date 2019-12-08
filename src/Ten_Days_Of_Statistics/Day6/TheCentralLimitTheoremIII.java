package Ten_Days_Of_Statistics.Day6;

import java.util.Scanner;

public class TheCentralLimitTheoremIII {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double n = s.nextDouble();
        double mean = s.nextDouble();
        double std = s.nextDouble();
        double interval = s.nextDouble();
        double z = s.nextDouble();


        double marginOfError = z * std / Math.sqrt(n);
        System.out.println(round(mean - marginOfError, 2));
        System.out.println(round(mean + marginOfError, 2));
    }
    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
