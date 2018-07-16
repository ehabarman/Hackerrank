//Date 8-7-2018

package Java_Proficiency.easy;

import java.util.*;

class JavaLoopsII{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        int[] pow = {1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384};
        for(int i=0;i<t;i++){
            long a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            
            a+=b;
            System.out.print(a);
            for(int j=1;j<n;j++)
            {
            	a+=pow[j]*b;
            	
            	System.out.print(" "+a);
            }
            System.out.println();
        }
        in.close();
    }
}
