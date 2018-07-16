//Date 14-7-2018
package Algorithms.Implementation.medium;

import java.util.Scanner;

public class AbsolutePermutation {

	public static void main(String [] args) {
		Scanner s =new Scanner (System.in);
		int t = s.nextInt();
		while(t-->0) {
			
			int n = s.nextInt();
			int k = s.nextInt();
			int temp=k;
			if(k == 0){
	            for(int i = 1; i <= n; i++){
	                System.out.print(i+" ");
	            }
	        }else if((n % (2*k)) == 0){
	            for(int i = 1; i <= n; i++){
	            	System.out.print((i+temp)+" ");
	                if(i % k == 0){
	                    temp = temp * -1;
	                }
	            }        
	        }else{
	        	System.out.print(-1);
	        }
			System.out.println();
		}
		
		
		s.close();
	}
}
