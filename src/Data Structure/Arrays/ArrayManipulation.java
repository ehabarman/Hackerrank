//Date 2-9-2018

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(),m=s.nextInt();
        long [] arr = new long[n+1];
        
        int p,q;
        long sum;
        for(int i=0;i<m;i++){
            p=s.nextInt();
            q=s.nextInt();
            sum=s.nextLong();
            arr[p]+=sum;
                if ( q+1 <=n )
                    arr[q+1]-=sum;
        }
        
        long currentSum=0,maxSum=0;
        for(int i=1;i<=n;i++)
        {
           currentSum=currentSum+arr[i];
           if(maxSum<currentSum) maxSum=currentSum;

        }
        System.out.println(maxSum);
        s.close();
    }
}