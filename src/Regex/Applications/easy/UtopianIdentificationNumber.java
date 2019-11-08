package Regex.Applications.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UtopianIdentificationNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        Pattern pattern = Pattern.compile("^[a-z]{0,3}\\d{2,8}[A-Z]{3,}$");
        while (n-- > 0) {
            String line = s.nextLine();
            Matcher m = pattern.matcher(line);
            if (m.find())
                System.out.println("VALID");
            else
                System.out.println("INVALID");
        }
    }
}
