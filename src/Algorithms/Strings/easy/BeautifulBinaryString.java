//Date 25-9-2018

package Algorithms.Strings.easy;

import java.util.*;

public class BeautifulBinaryString {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        int switches = 0;

        for(int i = 0; i < s.length()-2; i++)
        {
            if(s.charAt(i) == '0' && s.charAt(i+1) == '1' && s.charAt(i+2) == '0')
            {
                switches++;
                i += 2;
            }
        }
        System.out.println(switches);
    }
}
