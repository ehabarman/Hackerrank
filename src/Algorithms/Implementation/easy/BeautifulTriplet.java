//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Arrays;
import java.util.Scanner;

public class BeautifulTriplet {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int d = s.nextInt();
		int [] arr= new int [n];
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		
		int count = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            if (Arrays.stream(arr).anyMatch(no -> no == x + d) 
            		&& Arrays.stream(arr).anyMatch(no -> no == (x + d + d))) {
                count += 1;
            }
        }
        System.out.println(count);
        s.close();
	}
}
