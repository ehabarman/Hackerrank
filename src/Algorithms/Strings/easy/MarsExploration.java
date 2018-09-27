//Date 25-9-2018

package Algorithms.Strings.easy;

import java.util.*;

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int count = 0;
        int currentPos = 0;
        for(char letter : S.toCharArray())
        {

            if(currentPos % 3 == 1)
            {
                count += (letter != 'O') ? 1 : 0;
            }
            else
            {
                count += (letter != 'S') ? 1 : 0;
            }
            currentPos++;
        }
        System.out.println(count);
    }
}
