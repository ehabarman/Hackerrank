//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class AppleAndOrange {

	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     int s = in.nextInt();
	     int t = in.nextInt();
	     int a = in.nextInt();
	     int b = in.nextInt();
	     int m = in.nextInt();
	     int n = in.nextInt();
	     int apple;
	     int appleCounter=0;
	     for(int apple_i=0; apple_i < m; apple_i++){
	         apple = in.nextInt();
	         if(a+apple>=s&&a+apple<=t)
	            appleCounter++;
	     }
	     System.out.println(appleCounter++);
	     int orange;
	     int orangeCounter=0;
	     for(int orange_i=0; orange_i < n; orange_i++){
	         orange = in.nextInt();
	         if(b+orange>=s&&b+orange<=t)
	            orangeCounter++;
	     }
	     System.out.println(orangeCounter++);
	     in.close();
	}
}
