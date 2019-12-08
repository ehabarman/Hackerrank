package Ten_Days_Of_Statistics.Day5;

import java.util.Scanner;

public class PoissonDistributionI {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        double mean = s.nextDouble();
        int x = s.nextInt();
        double result = poissonDistribution(mean, x);
        System.out.println(round(result, 3));
    }

    public static double poissonDistribution(double mean, int x){
        double e = 2.71828;
        double result = Math.pow(mean, x) * Math.pow(e, -1 * mean) / factorial(x);
        return result;
    }

    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }

    public static double factorial(int n){
        return n <= 1 ? 1 : n * factorial(n-1);
    }
}
