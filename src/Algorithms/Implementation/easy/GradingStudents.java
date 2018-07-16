//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class GradingStudents {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n =s.nextInt();
		for(int i=0;i<n;i++)
		{
			
			int mark = s.nextInt();
			if(mark <38)
				System.out.println(mark);
			else if( mark- (mark/5)*5 >=3)
				System.out.println(((mark/5)+1)*5);
			else 
				System.out.println(mark);
		}
				
		
		
		s.close();
	}
}
