//Date 12-7-2018
package Algorithms.Warmup.easy;

import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        in.close();
        int counterAlice=0;
        int counterBob=0;
        
        if(a0>b0)
            counterAlice++;
        else if (a0<b0)
            counterBob++;
        
        if(a1>b1)
            counterAlice++;
        else if (a1<b1)
            counterBob++;
            
        if(a2>b2)
            counterAlice++;
        else if (a2<b2)
            counterBob++;
            
            System.out.println(counterAlice+" "+counterBob);
            
    }
}
