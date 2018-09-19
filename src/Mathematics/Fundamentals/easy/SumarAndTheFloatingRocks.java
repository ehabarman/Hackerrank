//Date 19-9-2018

package Mathematics.Fundamentals.easy;

import java.util.Scanner;

public class SumarAndTheFloatingRocks {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        while (t-- > 0) {

            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int x2 = s.nextInt();
            int y2 = s.nextInt();

            int result = gcd(Math.abs(y2 - y1), Math.abs(x2 - x1)) - 1;

            System.out.println(result);
        }

        s.close();

    }

    private static int gcd(int a, int b){
        return b != 0 ? gcd(b, a%b) : a ;
    }
}
