//Date 12-7-2018
package Algorithms.Warmup.easy;

import java.util.Arrays;
import java.util.Scanner;

public class BirthdayCakeCandles {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int candlesNum = s.nextInt();
		int [] candlesHeight = new int[candlesNum];
		
		for(int i =0; i<candlesNum;i++)
			candlesHeight[i]=s.nextInt();
		
		Arrays.sort(candlesHeight);
		int tallestCandleCount =0;
		int tallestCandleHeight = candlesHeight[candlesNum-1];
		
		for(int i =0; i<candlesNum;i++)
		{
			if(tallestCandleHeight==candlesHeight[i])
				tallestCandleCount++;
		}
		
		System.out.println(candlesNum-tallestCandleCount);
		
		s.close();
	}
}
