//Date 30-9-2018

package Algorithms.Strings.easy;

import java.util.*;

public class TheLoveLetterMystery {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            String s = in.next();
            int count = 0;
            for (int i = 0; i < s.length()/2; i++) {
                count += Math.abs(s.charAt(i) - s.charAt(s.length()-i-1));
            }
            System.out.println(count);
        }
    }

}
