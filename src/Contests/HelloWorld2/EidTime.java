package Contests.HelloWorld2;
//Date 17-7-2018
import java.util.Scanner;

public class EidTime {

	public static void main(String [] args) {
		Scanner s = new Scanner(System.in);
		
		int t = s.nextInt();
		
		while(t-->0)
		{
			int n = s.nextInt();
			int max =0;
			while(n-->0)
				max = Math.max(max, s.nextInt());
			
			System.out.println(max);
		}
		
		
		
		s.close();
	}
}
