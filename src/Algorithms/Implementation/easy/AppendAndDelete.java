//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class AppendAndDelete {

	 public static void main(String[] args) {
		 Scanner in = new Scanner(System.in);
	     String s = in.next();
	     String t = in.next();
	     int k = in.nextInt();
	     int i;
	     for(i=0;i<s.length()&&i<t.length();i++)
	    	 if(s.charAt(i)!=t.charAt(i))
	    		 break;
 
	     int d=s.length()-i;
	     int a=t.length()-i;     
	     int p=k-d-a;
	     
	     if(p==0)
	    	 System.out.println("Yes");
	     else if(p<0)
	    	 System.out.println("No");
	     else{
	    	 
	    	 if(p%2==0)
	    		 System.out.println("Yes");
	    	 else {
		         if(p>=(2*i))
		          	System.out.println("Yes");
		         else
		         	System.out.println("No");	          
	         }
	     }
	     in.close();
	 }
}
