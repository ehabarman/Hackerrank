package Ten_Days_Of_Statistics.Day1;

import java.util.Scanner;

public class StandardDeviation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = s.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = s.nextInt();

        double mean = mean(arr);
        double standardDeviation = standardDeviation(arr, mean);

        System.out.println(Math.round(standardDeviation * 10) / 10.0);



    }

    public static double standardDeviation(int[] arr, double mean){
        double result = 0;

        for (int i=0;i <arr.length;i++)
            result += Math.pow(arr[i]-mean,2);

        result /= arr.length;

        return Math.sqrt(result);
    }

    public static double mean(int[] arr) {
        double sum = 0;
        int n = arr.length;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        return sum / n;
    }

}
