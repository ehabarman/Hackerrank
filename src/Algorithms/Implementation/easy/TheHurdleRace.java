//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class TheHurdleRace {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int n = s.nextInt();
		int danJump = s.nextInt();
		int maxHeight = 0;
		for(int i=0;i<n;i++)
			maxHeight = Math.max(maxHeight, s.nextInt());
		
		if(danJump>=maxHeight)
			System.out.println(0);
		else 
			System.out.println(maxHeight-danJump);
		
		s.close();

	}

}
