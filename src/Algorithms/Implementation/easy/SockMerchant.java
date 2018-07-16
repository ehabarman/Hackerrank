//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class SockMerchant {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        boolean[] b = new boolean[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++)
            if(b[i]==true)
            continue;
            else
            for(int j=i+1;j<n;j++)
                   if(b[j]==false&&c[j]==c[i])
                    {
                        count++;
                        b[j]=true;
                        b[i]=true;
                        break;
                    }
        
        System.out.println(count);
        in.close();
    }
}
