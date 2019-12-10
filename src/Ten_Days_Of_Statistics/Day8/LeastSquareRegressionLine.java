package Ten_Days_Of_Statistics.Day8;


import java.util.ArrayList;
import java.util.Scanner;

public class LeastSquareRegressionLine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Double> mathAptitude = new ArrayList<>();
        ArrayList<Double> courseScore = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            String[] pair = s.nextLine().split("\\s");
            mathAptitude.add(Double.parseDouble(pair[0]));
            courseScore.add(Double.parseDouble(pair[1]));
        }

        Double[] x = mathAptitude.toArray(new Double[mathAptitude.size()]);
        Double[] y = courseScore.toArray(new Double[courseScore.size()]);
        double sumX = 0, sumY = 0, sumsX = 0, xy = 0;
        for (int i = 0; i < 5; i++) {
            sumX += x[i];
            sumY += y[i];
            sumsX += x[i] * x[i];
            xy += x[i] * y[i];
        }
        double avgx = sumX / 5, avgy = sumY / 5;
        double b = (5 * xy - sumX * sumY) / (5 * sumsX - sumX * sumX);
        double a = avgy - b * avgx;
        double ans = a + b * 80;
        System.out.printf("%.3f", ans);
    }
}
