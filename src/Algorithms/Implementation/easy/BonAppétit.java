//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class BonAppétit {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int [] c = new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
            {
            c[i]=s.nextInt();
            sum+=c[i];
        }
        sum-=c[k];
        int charged=s.nextInt();
        if(sum/2==charged)
        System.out.println("Bon Appetit");
        else
        System.out.println(charged-sum/2);  
        s.close();
    }
}
