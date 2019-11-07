package Regex.Applications.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankTweets {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        Pattern pattern = Pattern.compile("[hH][aA][cC][kK][eE][rR][rR][aA][nN][kK]");
        int counter = 0;
        while (n-- > 0) {
            String line = s.nextLine();
            Matcher m = pattern.matcher(line);
            if (m.find())
                counter++;
        }
        System.out.println(counter);
    }

}
