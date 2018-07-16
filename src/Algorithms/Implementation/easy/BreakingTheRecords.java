//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class BreakingTheRecords {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		int games = s.nextInt();
		int min = s.nextInt();
		int max = min;
		int maxCount=0;
		int minCount=0;
		
		for(int i =1;i<games;i++)
		{
			int score = s.nextInt();
			
			if(score > max)
			{
				max = score;
				maxCount++;
			}
			if(score <min)
			{
				min=score;
				minCount++;
			}
		}
		
		System.out.println(maxCount+" "+minCount);
		
		s.close();
	}
}
