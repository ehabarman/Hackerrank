//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class HalloweenSale {

	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		
		int p = in.nextInt();
		int d = in.nextInt();
		int m = in.nextInt();
		int s = in.nextInt();
		
		int numOfSales = (int) Math.ceil( ( (double)(p-m) )/d);
		
		int nextPrice = p;
		int count=0;
		while(s>0)
		{
			if(nextPrice>s)
				break;
			s-=nextPrice;
			count++;
			if(numOfSales!=0)
			{
				numOfSales--;
				nextPrice-=d;
				if(nextPrice<m)
					nextPrice=m;
			}
		}
		
		System.out.println(count);
		in.close();
	}
}
