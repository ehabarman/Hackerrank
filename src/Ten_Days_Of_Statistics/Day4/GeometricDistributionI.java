package Ten_Days_Of_Statistics.Day4;

public class GeometricDistributionI {
    public static void main(String[] args){
        double p = 1.0/3.0;
        int n = 5;
        double result = geometric(n, p);

        System.out.println( round(result, 3));
    }

    public static double geometric(int n, double p){
        return Math.pow(1-p, n-1) * p;
    }
    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }

}
