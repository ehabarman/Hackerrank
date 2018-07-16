//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class JumpingOnTheCloudsRevisited {

	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int c[] = new int[n];
	        for(int c_i=0; c_i < n; c_i++){
	            c[c_i] = in.nextInt();
	        }
	        int e=99;
	        int i=0;
	        i=(i+k)%n;
	        if(c[i]==1)
	            e-=2;
	        while(i!=0)
	            {
	            e--;
	            i=(i+k)%n;
	            if(c[i]==1)
	            e-=2;
	        }
	        System.out.println(e);
	        in.close();
	    }
}
