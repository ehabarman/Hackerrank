//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class FindDigits {

	public static void main(String[] args) {
	      
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        
        for(;t>0;t--)
            {
            String n = s.next();
            int num= Integer.parseInt(n);
            int count =0;
            for(int i=0;i<n.length();i++)
             {
                if(n.charAt(i)=='0')
                    continue;
                if(num%(int)(n.charAt(i)-'0')==0)
                    count++;
            }
            System.out.println(count);
        }
        s.close();
    }
}
