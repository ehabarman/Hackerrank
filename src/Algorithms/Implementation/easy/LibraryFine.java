package Algorithms.Implementation.easy;

import java.util.Scanner;

public class LibraryFine {

	public static void main(String[] args) {

		Scanner s = new Scanner (System.in);
		int returnDay = s.nextInt();
		int returnMonth = s.nextInt();
		int returnYear = s.nextInt();
		int dayDate = s.nextInt();
		int monthDate = s.nextInt();
		int yearDate = s.nextInt();
		s.close();
		
		if(returnYear > yearDate)
			System.out.println(10000);
		else if ((returnYear < yearDate))
			System.out.println(0);
		else {
			if(returnMonth > monthDate)
				System.out.println(500*(returnMonth-monthDate));
			else if (returnMonth < monthDate)
				System.out.println(0);
			else {
				if(returnDay > dayDate)
					System.out.println(15*(returnDay-dayDate));
				else if (returnDay <= dayDate) {
					System.out.println(0);
				}
			}
		}

	}

}
