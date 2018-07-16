//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class ElectronicsShop {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		int money = s.nextInt();

		int []firstItem = new int [s.nextInt()];
		int []secondItem = new int [s.nextInt()];
		
		
		for(int i=0;i<firstItem.length;i++)
			firstItem[i]=s.nextInt();
		
		for(int i=0;i<secondItem.length;i++)
			secondItem[i]=s.nextInt();
		
		int max = -1;
		
		for(int i=0;i<firstItem.length;i++)
			for(int j=0;j<secondItem.length;j++)
			{
				int sum = firstItem[i]+secondItem[j];
				
				if(sum > max && sum<=money)
					max = sum;
					
			}
		
		System.out.println(max);
		s.close();
		
	}
}
