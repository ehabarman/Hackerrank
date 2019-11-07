package Regex.Applications.easy;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DetectHTMLTags {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        Pattern pattern = Pattern.compile("<([a-z][a-z0-9]*)[^>]*>");
        HashSet<String> set = new HashSet<String>();
        while (n-- >= 0) {
            String line = s.nextLine();
            Matcher m = pattern.matcher(line);
            while (m.find())
                set.add(m.group(1));
        }
        ArrayList<String> list = new ArrayList<>(set);
        Collections.sort(list);
        System.out.println(String.join(";", list));
    }
}
