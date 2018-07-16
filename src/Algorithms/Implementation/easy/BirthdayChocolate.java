//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class BirthdayChocolate {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int [] bars = new int[n];
		
		for(int i =0;i<n;i++)
			bars[i]=s.nextInt();
		
		int d = s.nextInt();
		int m = s.nextInt();
		int countSequence=0;
		
		for(int i=0;i<=n-m;i++)
		{
			int sum=0;
			
			for(int j=i;j<i+m;j++)
				sum+=bars[j];
			
			if(sum==d)
				countSequence++;
		}
		
		System.out.println(countSequence);
		
		
		s.close();
	}
}
