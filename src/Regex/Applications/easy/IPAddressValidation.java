package Regex.Applications.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAddressValidation {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String ipv_4 = "^(([0-1]?[0-9]{1,2}|[2][0-4][0-9]|[2][5][0-5])\\.){3}([0-1]?[0-9]{1,2}|[2][0-4][0-9]|[2][5][0-5])$";
        String ipv_6 = "^([0-9a-f]{1,4}:){7}[0-9a-f]{1,4}$";
        Pattern pattern4 = Pattern.compile(ipv_4);
        Pattern pattern6 = Pattern.compile(ipv_6);
        while (n-- > 0) {
            String line = s.nextLine();
            Matcher m4 = pattern4.matcher(line);
            Matcher m6 = pattern6.matcher(line);
            if (m4.find())
                System.out.println("IPv4");
            else if (m6.find())
                System.out.println("IPv6");
            else
                System.out.println("Neither");
        }
    }
}
