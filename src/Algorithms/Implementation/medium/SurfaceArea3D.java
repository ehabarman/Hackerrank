//Date 14-7-2018
package Algorithms.Implementation.medium;

import java.util.Scanner;

public class SurfaceArea3D {

	public static void main(String [] args) {
		Scanner in = new Scanner (System.in);
		int h = in.nextInt();
		int w = in.nextInt();
		int [][]a = new int [h][w];
	    int sum=0;

	    for(int i=0;i<h;++i)
	        for(int j=0;j<w;++j)
	        {
	            a[i][j]=in.nextInt();;
	            if(i==0)
	                sum=sum+a[i][j];
	            if(i==h-1)
	                sum=sum+a[i][j];
	            if(j==0)
	                sum=sum+a[i][j];
	            if(j==w-1)
	                sum=sum+a[i][j];
	        }
	    for(int i=0;i<h;++i)
	        for(int j=0;j<w-1;++j)
	        {
	            if(a[i][j]<a[i][j+1])
	                sum=sum+(a[i][j+1]-a[i][j]);
	            if(a[i][w-j-1]<a[i][w-j-2])
	               sum=sum+(a[i][w-j-2]-a[i][w-j-1]);
	        }
	    for(int i=0;i<h-1;++i)
	        for(int j=0;j<w;++j)
	        {
	            if(a[i][j]<a[i+1][j])
	                sum=sum+(a[i+1][j]-a[i][j]);
	            if(a[h-i-1][j]<a[h-i-2][j])
	               sum=sum+(a[h-i-2][j]-a[h-i-1][j]);
	        }
	    System.out.println(sum+(2*h*w));
		
		in.close();
	}
}

