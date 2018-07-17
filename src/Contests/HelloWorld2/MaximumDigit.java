//Date 17-7-2018
package Contests.HelloWorld2;

import java.util.Scanner;

public class MaximumDigit {

	public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int m=n;
        int [] digits = new int [10];
        while(n>0) {
        digits[n%10]++;
        n/=10;
        }
        
        for(int i =9;i>=1;i--)
        	if(digits[i]!=0  && m%i==0)
        	{
        		System.out.println(i);
        		break;
        	}
        s.close();
        
    }
}
