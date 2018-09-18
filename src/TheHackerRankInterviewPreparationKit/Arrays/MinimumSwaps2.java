//Date 18-9-2018

package TheHackerRankInterviewPreparationKit.Arrays;

import java.util.*;

public class MinimumSwaps2 {
    // Complete the minimumSwaps function below.
    private static int minimumSwaps(int[] arr) {
        int j,temp, count =0;
        for (int i = 0;i<arr.length-1;i++){
            if( arr[i]==i+1)
                continue;
            for(j = i+1;j<arr.length;j++){
                if (arr[j]==i+1)
                {
                    temp = arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                    count++;
                    break;
                }
            }
        }
        return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int res = minimumSwaps(arr);
        System.out.println(res);
        scanner.close();
    }
}
