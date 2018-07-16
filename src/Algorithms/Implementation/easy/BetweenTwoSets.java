//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class BetweenTwoSets {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        int max=0;
        int min=400000000;
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a[a_i]>max)
                max=a[a_i];
        }
   
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(b[b_i]<min)
                min=b[b_i];
        }
  
        int count=0;
        for(int i=max;i<=min;i++)
            {
            boolean flag=true;
            for(int j=0;j<a.length;j++)
                {
                    if(i%a[j]!=0)
                        {
                            flag=false;
                            break;
                    }
            }

            for(int j=0;j<b.length&&flag;j++)
                {
                    if(b[j]%i!=0)
                        flag=false;
            }
            if(flag)
                count++;
        }
        System.out.println(count);
        in.close();
    }
}
