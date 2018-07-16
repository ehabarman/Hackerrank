//Date 12-7-2018
package Algorithms.Implementation.easy;

import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
        long counter=3;
        long init=3;
     
        while(true)
            {
            t-=init;
            if(t<=0)
                {
                t+=init;
                break;
            }
            else{
                init*=2;
            }
        }
     
        counter=init;
        counter=counter-t+1;
        System.out.println(counter);
        in.close();
    }
}
