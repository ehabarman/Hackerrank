package Regex.Applications.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SplitThePhoneNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        Pattern pattern = Pattern.compile("(\\d+)(-|\\s)(\\d+)(-|\\s)(\\d+)");
        while (n-- > 0) {
            String line = s.nextLine();
            Matcher m = pattern.matcher(line);
            m.find();
            System.out.println("CountryCode="+m.group(1)+",LocalAreaCode="+m.group(3)+",Number="+m.group(5));
        }
    }
}
