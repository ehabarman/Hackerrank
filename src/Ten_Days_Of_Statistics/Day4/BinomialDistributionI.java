package Ten_Days_Of_Statistics.Day4;

public class BinomialDistributionI {
    public static void main(String[] args){
        double result = 0;
        double boys = 1.09/2.09;
        int children = 6;

        for(int i = 3; i <= children ; i++){
            result += binomial(children, i, boys);
        }
        System.out.println(round(result, 3));

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
