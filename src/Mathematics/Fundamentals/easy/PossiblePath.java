//date 18-9-2018

package Mathematics.Fundamentals.easy;

import java.util.Scanner;

public class PossiblePath {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        while( t-->0){

            System.out.println(euclideanGCD(s.nextInt(),s.nextInt())==
                    euclideanGCD(s.nextInt(),s.nextInt())? "YES" : "NO");
        }

        s.close();
    }

    public static long euclideanGCD(long a, long b)
    {
        return a == 0 ? b : euclideanGCD(b % a, a);
    }
}
