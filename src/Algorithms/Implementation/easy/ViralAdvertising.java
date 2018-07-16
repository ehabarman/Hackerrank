//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class ViralAdvertising {

	 public static void main(String[] args) {
	        
	       Scanner s = new Scanner(System.in);
	       int num=5;
	       int sum=2;
	       int d = s.nextInt();
	       for(int i=2;i<=d;i++)
	       {
	            
	            num= (num/2) *3;
	            sum+=num/2;
	       }
	        System.out.println(sum);
	        s.close();
	    }
}
