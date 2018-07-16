//Date 13-7-2018
package Algorithms.Implementation.easy;


import java.util.Scanner;

public class MigratoryBirds {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int []typeCount = {0,0,0,0,0,0};
		
		for(int i =0;i<n;i++)
			typeCount[s.nextInt()]++;
		
		int max = 0;
		int type = 0;
		for(int i=1;i<=5;i++)
			if(typeCount[i]>max)
			{
				max = typeCount[i];
				type=i;
			}
		System.out.println(type);
		
		s.close();
	}
}
