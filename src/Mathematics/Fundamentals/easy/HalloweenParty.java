//Date 19-9-2018

package Mathematics.Fundamentals.easy;

import java.util.Scanner;

public class HalloweenParty {

    /*
     * Complete the halloweenParty function below.
     */
    private static long halloweenParty(int k) {

        long half = k/2;
        if(k%2==0)
            return half*half;
        else
            return (half+1)*half;
    }


    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        for (int tItr = 0; tItr < t; tItr++) {
            int k = s.nextInt();
            long result = halloweenParty(k);
            System.out.println(result);
        }

        s.close();
    }
}
