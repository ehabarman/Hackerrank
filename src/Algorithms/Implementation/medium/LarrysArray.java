//Date 14-7-2018
package Algorithms.Implementation.medium;

import java.util.Scanner;

public class LarrysArray {

	public static void main(String[] args) {
	    Scanner s=new Scanner(System.in);
	    int t=s.nextInt();
	    for (int i1=0;i1<t;i1++)
	    {   int c=0;
	        int n=s.nextInt();
	        int array[]=new int[n];
	        for(int i2=0;i2<n;i2++)
	        {
	            array[i2]=s.nextInt();

	        }
	        for (int j = 1; j < n; j++) {
		        int key = array[j];
		        int i = j-1;
		        while ( (i > -1) && ( array [i] > key ) ) {
		            array [i+1] = array [i];
		            i--;
		            c++;
		        }
	        array[i+1] = key;   


	    }
	        if(c%2==0)
	            System.out.println("YES");
	        else
	            System.out.println("NO");

	    }
	    s.close();
	}
}
