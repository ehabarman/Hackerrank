//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class CatsAndAMouse {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int q = s.nextInt();
		
		while(q-->0) {
			int catA = s.nextInt();
			int catB = s.nextInt();
			int mouseC =s.nextInt();
			
			int distanceA = Math.abs(mouseC-catA);
			int distanceB = Math.abs(mouseC-catB);
			
			if(distanceA<distanceB)
				System.out.println("Cat A");
			else if (distanceA>distanceB)
				System.out.println("Cat B");
			else
				System.out.println("Mouse C");
			
			
		}
		s.close();
	}

}
