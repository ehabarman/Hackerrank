//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class FlatlandSpaceStations {

public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        boolean [] c = new boolean [s.nextInt()];
        int st = s.nextInt();
        for (int i=0;i<st;i++)
            c[s.nextInt()]=true;
        
       int max=0;
        for (int i=0;i<c.length;i++)
            {
                boolean found=false;
                int min=0;
                int left=0;
                int right=0;
                if(c[i]==true)
                    continue;
                else
                    {
                    int j=i;
                    
                    while(j>0)
                        {
                        left++;
                        j--;
                        if(c[j]==true)
                        {   
                            min=left;
                            found=true;
                            break;
                        }
     
                             
                    }
                    j=i;

                    while(j<c.length-1)
                        {
                      right++;
                      j++;
                    if(c[j]==true)
                      {   
                            if(right<left||!found)
                            min=right;
                            break;
                     }
                    }
                    
                }
            
            if(max<min)
                max=min;
        }
        System.out.println(max);
        s.close();
    }
}
