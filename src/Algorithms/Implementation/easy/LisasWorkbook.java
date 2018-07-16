//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class LisasWorkbook {

	public static void main(String[] args) 
    {
	    Scanner sc = new Scanner(System.in);  
	    int n = sc.nextInt(); 
	    int k = sc.nextInt();  
	    int [] a = new int[n];  
	        
	    for(int i=0;i<n;i++)
	        a[i]=sc.nextInt();  
	    
	    int p=1;  
	    int c=0;  
	        
	   
	    for(int i=0;i<n;i++)
	    {
	        int m=1;  
	        while(m<=a[i])  
	        {
	            for(int j=1;j<=k&&m<=a[i];j++)
	            {
	                if(p==m)  
	                    c++; 
	                
	                m++; 
	            }
	            p++;  
	        }
	    }
	        System.out.print(c); 
	        sc.close();
    }
}
