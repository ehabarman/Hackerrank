//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class EqualizeTheArray {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []typeCount = new int [101];
		
		for(int i =0;i<n;i++)
			typeCount[s.nextInt()]++;
		
		int max = 0;
		for(int i=1;i<=100;i++)
			if(typeCount[i]>max)
			{
				max = typeCount[i];
			}
		System.out.println(n-max);
		
		s.close();
	}
}
