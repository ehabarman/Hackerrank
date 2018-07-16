//Date 8-7-2018
package Java_Proficiency.easy;

import java.util.Scanner;


public class JavaSubstringComparisons {

	public static String getSmallestAndLargest (String s,int subLength)
	{
	    
	       int iterations = s.length()-subLength;
	       String largest = s.substring(0,subLength);
	       String smallest = s.substring(0,subLength);
	       for(int i = 0; i<=iterations;i++)
	       {
	           if(largest.compareTo(s.substring(i,i+subLength))<0)
	           {
	               largest = s.substring(i,i+subLength);
	           }
	           if(smallest.compareTo(s.substring(i,i+subLength))>0)
	           {
	               smallest = s.substring(i,i+subLength);
	           }
	       }
	       System.out.println(smallest);
	       System.out.print(largest);
	    
	    return "";
	}
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}
