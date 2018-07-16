//Date 13-7-2018
package Algorithms.Implementation.medium;

import java.util.Scanner;

public class FormingAMagicSquare {
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);
		int [] [] magicSquareSolutions = {{4,9,2,3,5,7,8,1,6}
											,{8,3,4,1,5,9,6,7,2}
											,{2,7,6,9,5,1,4,3,8}
											,{6,1,8,7,5,3,2,9,4}
											,{2,9,4,7,5,3,6,1,8}
											,{8,1,6,3,5,7,4,9,2}
											,{4,3,8,9,5,1,2,7,6}
											,{6,7,2,1,5,9,8,3,4}};
		int [] cost = new int [8];
		for(int i =0;i<9;i++) {
			int cell = s.nextInt();
			for(int j=0;j<8;j++)
				cost[j]+= Math.abs(cell-magicSquareSolutions[j][i]);
		}

		
		int min=cost[0];
		for(int i =1;i<8;i++)
			min = Math.min(min, cost[i]);	
		System.out.println(min);

		s.close();
	}

}
