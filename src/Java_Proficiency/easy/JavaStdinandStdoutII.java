//Date 8/7/2018

package Java_Proficiency.easy;

import java.util.Scanner;

public class JavaStdinandStdoutII {

	 public static void main(String[] args) {
	        Scanner s = new Scanner(System.in);
	        int i = s.nextInt();
	        double d = s.nextDouble();
	        s.nextLine();
	        String ss = s.nextLine();

	        // Write your code here.

	        System.out.println("String: " + ss);
	        
	        long e = (long)d;
	        double r=(e-d);
	        
	        if(r == 0)
	            System.out.println("Double: " + d);
	        else
	            System.out.println("Double: " + d);
	        System.out.println("Int: " + i);
	        
	        
	        s.close();
	 }
}
