//Date 12-7-2018
package Algorithms.Warmup.easy;

import java.util.Scanner;

public class PlusMinus {

	public static void main(String[] args) {
	       
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        double counterPos=0,counterNeg=0,counterZero=0;
        for(int i=0;i<n;i++)
            {
            int num=s.nextInt();
            if(num>0)
                counterPos++;
            else if (num<0)
                counterNeg++;
            else
                counterZero++;    
            
        }
        System.out.println(counterPos/n);
        System.out.println(counterNeg/n);
        System.out.println(counterZero/n);
        s.close();
    }
}
