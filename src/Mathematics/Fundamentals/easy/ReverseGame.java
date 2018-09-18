// Date 18-9-2018

package Mathematics.Fundamentals.easy;

import java.util.*;

public class ReverseGame {

    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int t = scanner.nextInt();
        while(t-->0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            int []arr = new int[n+1];
            int j = 0;
            for( int i = n-1; i>=n/2;i-- ){
                arr[j]=i;
                arr[j+1]= n-i-1;
                j+=2;
            }
            for(int i = 0 ; i<n;i++)
                if(arr[i] == k){
                    System.out.println(i);
                    break;
                }
        }
    }
}
