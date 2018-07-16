//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceLane {


    public static void main(String[] args) {

	    Scanner s = new Scanner(System.in);
	    int n = s.nextInt(); 
	    int t = s.nextInt();
	    ArrayList<Integer> list = new ArrayList<Integer>();
	   
	    while(n-->0)
	    	list.add(s.nextInt());
	  
	    for(int i = 0; i < t; i++)
	    {
	        int x = s.nextInt();
	        int y = s.nextInt();           
	        int smallest = 10;
	
	        for(int j = x; j <= y; j++)
	        {
	            if(smallest > list.get(j))
	            {
	                smallest = list.get(j);                   
	            }        
	        }
		    System.out.println(smallest);       	    
	    }
	    s.close();
    }    
}

