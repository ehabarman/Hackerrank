package Regex.Applications.easy;

import java.util.*;
import java.util.regex.*;

public class TheBritishAndAmericanStyleOfSpelling {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < n; i++) {
            sb.append(in.nextLine());
        }

        int t = in.nextInt();
        while (t-- > 0) {
            int count = 0;
            String s = in.next();
            Pattern p = Pattern.compile(s);
            Matcher m = p.matcher(sb.toString());
            while (m.find()) {
                count += 1;
            }
            s = s.replace(s.charAt(s.length() - 2), 's');
            p = Pattern.compile(s);
            Matcher m1 = p.matcher(sb.toString());
            while (m1.find()) {
                count += 1;
            }
            System.out.println(count);
        }
    }
}
