package Regex.Applications.medium;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuildingASmartIDEIdentifyingComments {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        String lines = "";

        while (s.hasNext()) {
            lines += s.nextLine() + "\n";
        }

        Pattern pattern = Pattern.compile("((?s)/\\*.*?\\*/)|(//(.*[^\\s])?)");
        Matcher m1 = pattern.matcher(lines);

        while (m1.find()) {
            System.out.println(m1.group().trim().replaceAll("\\n\\s+", "\n"));
        }
    }
}
