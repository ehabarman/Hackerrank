package Regex.Applications.easy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class FindHackerRank {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        Pattern begin = Pattern.compile("^hackerrank");
        Pattern end = Pattern.compile("hackerrank$");
        Pattern both = Pattern.compile("^((hackerrank).*hackerrank|hackerrank)$");
        while (n-- > 0) {
            String line = s.nextLine();
            if (both.matcher(line).find())
                System.out.println("0");
            else if (begin.matcher(line).find())
                System.out.println("1");
            else if (end.matcher(line).find())
                System.out.println("2");
            else
                System.out.println("-1");
        }
    }
}
