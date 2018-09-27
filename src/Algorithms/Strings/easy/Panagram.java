//Date 25-9-2018

package Algorithms.Strings.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String s = input.nextLine();

        String[] alphabet = new String[]{"A","B","C","D","E",
                "F","G","H","I","J",
                "K","L","M","N","O",
                "P","Q","R","S","T",
                "U","V","W","X","Y","Z"};
        Set<String> pangramTracker = new HashSet<>(Arrays.asList(alphabet));

        for(char letter : s.toCharArray())
        {
            if(pangramTracker.contains(Character.toString(letter).toUpperCase()))
            {
                pangramTracker.remove(Character.toString(letter).toUpperCase());
            }

            if(pangramTracker.isEmpty())
            {
                System.out.println("pangram");
                System.exit(0);
            }
        }
        System.out.println("not pangram");
    }
}
