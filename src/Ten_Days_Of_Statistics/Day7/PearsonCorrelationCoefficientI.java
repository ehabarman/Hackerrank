package Ten_Days_Of_Statistics.Day7;

import java.util.Scanner;

public class PearsonCorrelationCoefficientI {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < n; i++)
            x[i] = s.nextDouble();

        for (int i = 0; i < n; i++)
            y[i] = s.nextDouble();

        double pearsonCorrelation = pearsonCorrelation(x, y);
        System.out.println(round(pearsonCorrelation, 3));
    }

    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }

    public static double pearsonCorrelation(double[] x, double[] y) {
        double xMean = mean(x);
        double yMean = mean(y);
        double xStd = standardDeviation(x, xMean);
        double yStd = standardDeviation(y, yMean);

        double sum = 0;
        for (int i = 0; i < x.length; i++)
            sum += (x[i] - xMean) * (y[i] - yMean);

        return sum / (x.length * xStd * yStd);
    }

    public static double standardDeviation(double[] arr, double mean) {
        double result = 0;
        for (int i = 0; i < arr.length; i++)
            result += Math.pow(arr[i] - mean, 2);
        result /= arr.length;
        return Math.sqrt(result);
    }

    public static double mean(double[] arr) {
        double sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++)
            sum += arr[i];
        return sum / n;
    }
}
