package Regex.Applications.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectingValidLatitudeAndLongitudePairs {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        Pattern pattern = Pattern.compile("\\([-+]?(([1-8]?[0-9])(\\.\\d+)?|90(\\.0+)?), [-+]?(([1-9]?[0-9]|1[0-7][0-9])(\\.\\d+)?|180(\\.0+)?)\\)");
        while (n-- > 0) {
            String line = s.nextLine();
            Matcher m = pattern.matcher(line);
            if(m.find())
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }
}
