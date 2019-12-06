package Ten_Days_Of_Statistics.Day4;

public class BinomialDistributionII {
    public static void main(String[] args){
        double result = 0;
        double rejects = 0.12;
        int pistons = 10;
        for(int i = 0; i <= 2 ; i++){
            result += binomial(pistons, i, rejects);
        }
        System.out.println(round(result, 3));

        result = 0;

        for(int i = 0; i <= 1 ; i++){
            result += binomial(pistons, i, rejects);
        }
        System.out.println(round(1 - result, 3) );

    }

    public static double binomial( int n, int x, double p){
        return combinations(n, x) * Math.pow(p, x) * Math.pow(1-p, n-x);
    }

    public static double factorial(int n){
        return n <= 1 ? 1 : n * factorial(n-1);
    }

    public static double combinations(int n, int x){
        return factorial(n)/(factorial(n-x) * factorial(x));
    }

    public static double round(double value, int precision) {
        int scale = (int) Math.pow(10, precision);
        return (double) Math.round(value * scale) / scale;
    }
}
