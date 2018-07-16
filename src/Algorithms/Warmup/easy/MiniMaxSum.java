//Date 12-7-2018
package Algorithms.Warmup.easy;

import java.util.Scanner;

public class MiniMaxSum {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long [] sum= new long[5];
        sum[1]= b+c+d+e;
        sum[2]= sum[1]+a-b;
        sum[3]= sum[2]+b-c;
        sum[4]= sum[3]+c-d;
        sum[0]= sum[4]+d-e;
        long max = sum[0];
        long min = sum[0];
        for(int i=1;i<=4;i++)
            {
            if (max<sum[i])
                max=sum[i];
  
            if (min>sum[i])
                min=sum[i];
        }
        System.out.println(min+" "+max);
        in.close();
    }
}
