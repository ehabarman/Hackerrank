//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class JumpingOnTheClouds {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int [] cloudes = new int [n+1];
		for(int i=0;i<n;i++)
			cloudes[i]=s.nextInt();
		
		int jumps=0;
		int index=0;
		
		while(true) {
			if(index+2<n &&cloudes[index+2]==0)
			{
				index+=2;
				jumps++;
			}
			else if (index+1<n &&cloudes[index+1]==0)
			{
				index++;
				jumps++;
			}
			else break;
		}
		System.out.println(jumps);
		s.close();
		
	}
}
