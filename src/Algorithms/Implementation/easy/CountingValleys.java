//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class CountingValleys {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		String steps = s.next();
		int location = 0;
		int valleysEntries=0;
		
		for(int i =0 ; i<n;i++)
		{
			switch(steps.charAt(i)) {
			
			case 'U': location++;
				break;
			case 'D': 
						if(location ==0)
						{
							valleysEntries++;
						}
						location--;
				break;
			}
		}
		
		System.out.println(valleysEntries);
		s.close();
	}
}
