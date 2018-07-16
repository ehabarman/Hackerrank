//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class PickingNumbers {

	public static void main(String [] args) {
		Scanner s = new Scanner (System.in);
		
		int n = s.nextInt();
		int[] arr = new int [101];
		
		for(int i =0;i<n;i++)
			arr[s.nextInt()]++;
		
		int max =0;
		
		for(int i=1;i<100;i++)
			max = Math.max(max, arr[i]+arr[i+1]);
		
		System.out.println(max);
		
		s.close();
	}
}
