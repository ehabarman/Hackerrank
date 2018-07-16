//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class Kangaroo {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        in.close();
        if(x1==x2)       
            System.out.println("YES");
        else if (v1==v2)
             System.out.println("NO");
        else if ((x1<x2 && v1<v2)||(x1>x2&&v1>v2))
             System.out.println("NO");
        else if(x1<x2)
            {
            while(true)
                {
                if(x1+v1==x2+v2)
                {
                    System.out.println("YES");
                    break;
                }
                else if(x1+v1>x2+v2)
                 {
                    System.out.println("NO");
                    break;
                }  
                else
                    {
                    x1+=v1;
                    x2+=v2;
                }
                    
            }
        }
         else
             {
              while(true)
                {
                if(x1+v1==x2+v2)
                {
                    System.out.println("YES");
                    break;
                }
                else if(x1+v1<x2+v2)
                 {
                    System.out.println("NO");
                    break;
                }  
                else
                    {
                    x1+=v1;
                    x2+=v2;
                }
                    
            }
         }
        }
}
