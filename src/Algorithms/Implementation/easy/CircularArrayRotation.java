//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class CircularArrayRotation {
	 
	public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int k = in.nextInt();
	        int q = in.nextInt();
	        int[] a = new int[n];
	        for(int a_i=0; a_i < n; a_i++){
	            a[a_i] = in.nextInt();
	        }
	         int shifts=k%n;
	        for(int a0 = 0; a0 < q; a0++){
	            int m = in.nextInt();
	            int prevLoc = m-shifts;
	            
	            if(prevLoc>=0)
	                System.out.println(a[prevLoc]);
	                else
	                {
	                System.out.println(a[n+prevLoc]);
	            }
	            
	        }
	       
	        in.close(); 
	    }

}
