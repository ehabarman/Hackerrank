//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class MinimumDistances {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		
		int n = s.nextInt();
		int [] arr = new int[n];
		
		for(int i =0;i<n;i++)
			arr[i]=s.nextInt();
		
		int min =10000;
		for(int i=0;i<n-1;i++)
			for(int j=i+1 ;j<n;j++)
				if(arr[i]==arr[j])
					min = Math.min(min, Math.abs(i-j));
		
		if(min==10000)
			System.out.println(-1);
		else
			System.out.println(min);
		
		s.close();
	}
}
