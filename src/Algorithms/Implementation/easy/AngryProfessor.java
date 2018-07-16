//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner s = new Scanner(System.in);
       int t = s.nextInt();
       
        for(;t>0;t--)
            {
            int n=s.nextInt();
            int k=s.nextInt();
            for(;n>0;n--)
                if(s.nextInt()<=0)
                    k--;
            
            if(k<=0)
                System.out.println("NO");
                else System.out.println("YES");
                
        }
        s.close();
    }
}
