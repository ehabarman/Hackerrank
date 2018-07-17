//Date 17-7-2018
package Mathematics.Fundamentals.easy;

import java.util.Scanner;

public class ConnectingTowns {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t-->0)
		{
			int n = s.nextInt()-1;
			int result =1;
			while(n-->0)
				result= (result * s.nextInt())%1234567 ;
				
			System.out.println(result);
		}
		
		s.close();
	}
}
