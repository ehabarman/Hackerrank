//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class SaveThePrisoner {

	public static void main(String[] args) {
	       
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        for(;t>0;t--)
            {
            int n = s.nextInt();
            int m = s.nextInt();
            int ID = s.nextInt();
            
            m%=n;
            
            int k = ID+m-1;
            if(k==0)
                System.out.println(n);
            else if(k<=n)
                System.out.println(k);
            else 
            {
                
                    System.out.println(k-n);
        }
            
        }
        s.close();
    }
}
