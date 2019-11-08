package Regex.Applications.medium;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectTheEmailAddresses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        Pattern pattern = Pattern.compile("\\w+[.\\w]*@\\w+[.\\w]+\\w+");

        TreeSet<String> set = new TreeSet<>();

        while (n-- > 0) {
            String input = in.nextLine();
            Matcher m = pattern.matcher(input);
            while (m.find())
                set.add(m.group(0));
        }

        for (String str : set) {
            System.out.print((str != set.last()) ? str + ";" : str);
        }
    }
}
