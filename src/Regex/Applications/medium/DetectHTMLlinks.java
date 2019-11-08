package Regex.Applications.medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLlinks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());

        Pattern pattern = Pattern.compile("<a href=\"(.*?)\".*?>([\\w .,\\/]*)(?=<\\/)");

        while (n-- > 0) {
            String input = in.nextLine();
            Matcher m = pattern.matcher(input);
            while (m.find())
                System.out.println(m.group(1)+","+m.group(2).trim());
        }

    }
}
