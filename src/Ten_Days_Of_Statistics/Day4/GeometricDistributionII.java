package Ten_Days_Of_Statistics.Day4;

public class GeometricDistributionII {
    public static void main(String[] args) {
        double p = 1.0 / 3.0;
        int n = 5;
        double result = 1 - Math.pow(1 - p, 5);

        System.out.println(round(result, 3));
    }

    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
