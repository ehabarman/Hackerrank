//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class ModifiedKaprekarNumbers {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);

	    int p = scanner.nextInt();
	
	    int q = scanner.nextInt();
	    long n = 0;
	    int d = 0;
	    int flag =0;
	    for (long i = p; i <= q; i++) 
	    {
	        n = i*i;
	        String s = Long.toString(n); 
	        if(s.length()%2==0)
	        {
	            d = s.length()/2;
	        }
	        else if(s.length()%2!=0)
	        {
	            if(s.length()==1)
	            {
	                d = 1;
	            }
	            else
	            {
	                d = s.length()/2+1;
	            }
	        }
	        String s1;
	        String s2;
	        if(s.length()-d==0)
	        {
	            s2 = s.substring(0,s.length());
	            s1 = "0";    
	        }
	        else
	        {
	            s2 = s.substring(s.length()-d,s.length());
	            s1 = s.substring(0,s.length()-d);
	        }
	        long x = Long.parseLong(s1);
	        long y = Long.parseLong(s2);
	        long z = x+y;
	        if(z == i)
	        {
	            flag = 1;
	            System.out.print(i);
	            System.out.print(" ");
	        }
	    }
	    if(flag == 0)
	    {
	        System.out.println("INVALID RANGE");
	    }
	    scanner.close();
	}

}
