//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class BeautifulDaysAtTheMovies {

	public static void main(String[] args) {
	       Scanner s = new Scanner(System.in);
	       int start = s.nextInt();
	       int end = s.nextInt();
	       int k = s .nextInt();
	       int count=0;
	       for(;start<=end;start++)
	           {
	           if(Math.abs(start-inverse(start))%k==0)
	               count++;
	       }
	        System.out.println(count);
	        s.close();
	    }
	    public static int inverse(int num)
	        {
	            int inverse=0;
	            while(num!=0)
	            {
	                inverse=10*inverse+num%10;
	                num=num/10;
	            }
	     
	        return inverse;
	    }
}
