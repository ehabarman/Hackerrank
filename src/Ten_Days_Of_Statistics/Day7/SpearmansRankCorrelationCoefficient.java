package Ten_Days_Of_Statistics.Day7;


import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class SpearmansRankCorrelationCoefficient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double[] X = new double[size];
        double[] Y = new double[size];
        for (int i = 0; i < size; i++) {
            X[i] = scan.nextDouble();
        }
        for (int i = 0; i < size; i++) {
            Y[i] = scan.nextDouble();
        }
        scan.close();

        System.out.format("%.3f", spearman(X, Y));
    }

    private static Double spearman(double[] X, double[] Y) {
        if (X == null || Y == null || X.length != Y.length) {
            return null;
        }

        int[] rankX = getRanks(X);
        int[] rankY = getRanks(Y);

        int n = X.length;
        double numerator = 0;
        for (int i = 0; i < n; i++) {
            numerator += Math.pow((rankX[i] - rankY[i]), 2);
        }
        numerator *= 6;
        return 1 - numerator / (n * ((n * n) - 1));
    }

    public static int[] getRanks(double[] array) {
        int n = array.length;
        Pair[] pair = new Pair[n];
        for (int i = 0; i < n; i++) {
            pair[i] = new Pair(i, array[i]);
        }
        Arrays.sort(pair, new PairValueComparator());

        int[] ranks = new int[n];
        int rank = 1;
        for (Pair p : pair) {
            ranks[p.index] = rank++;
        }
        return ranks;
    }
}

class Pair {
    public final int index;
    public final double value;

    public Pair(int i, double v) {
        index = i;
        value = v;
    }
}

class PairValueComparator implements Comparator<Pair> {
    double epsilon = 0.0001;

    @Override
    public int compare(Pair p1, Pair p2) {
        if (Math.abs(p1.value - p2.value) < epsilon) {
            return 0;
        } else if (p1.value < p2.value) {
            return -1;
        } else {
            return 1;
        }
    }
}
