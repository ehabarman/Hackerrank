package Regex.Applications.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BuildAStackExchangeScraper {
    public static void main(String[] args) throws Exception {

        StringBuilder builder = new StringBuilder();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()){
            builder.append(sc.nextLine() + "\n");
        }

        Pattern p = Pattern.compile(
                "href=\"\\/questions\\/(\\d+)\\/.+?>(.+?)<\\/a>(?:.+?)\"relativetime\">(.+?)<\\/span>", Pattern.DOTALL);
        Matcher m = p.matcher(builder.toString());

        while (m.find()) {
            System.out.println(m.group(1) + ";" + m.group(2) + ";" + m.group(3));
        }
    }
}
