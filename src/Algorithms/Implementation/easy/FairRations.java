//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class FairRations {

	public static void main(String[] args) {
	    Scanner in = new Scanner(System.in);
	    int n = in.nextInt();
	    int arr[] = new int[n];
	    int sum = 0;
	    for(int i=0; i < n; i++){
	    	arr[i] = in.nextInt();
	        sum+=arr[i];
	    }

	    int count = 0;
	    if(sum % 2 == 1){
	        System.out.println("NO");
	    }
	    else{
	        for(int i = 0; i<n; i++){
	            if(arr[i] % 2 != 0){
	            	arr[i] = arr[i] + 1;
	            	arr[i+1] = arr[i+1] + 1;
	                count+=2;
	            }

	        }
	        System.out.println(count);
	    }
	    in.close();
	}
}
