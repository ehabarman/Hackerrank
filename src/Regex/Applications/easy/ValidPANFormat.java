package Regex.Applications.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPANFormat {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        Pattern pattern = Pattern.compile("^[A-Z]{5}[0-9]{4}[A-Z]$");

        while (n-- > 0) {
            String line = s.nextLine();
            Matcher m = pattern.matcher(line);
            if (m.find())
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
