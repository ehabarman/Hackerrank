package Regex.Applications.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindASubWord {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String[] sentence = new String[n];
        for (int i = 0; i < n; i++)
            sentence[i] = s.nextLine();


        int q = Integer.parseInt(s.nextLine());
        while (q-- > 0) {
            int counter = 0;
            String query = s.nextLine();
            Pattern pattern = Pattern.compile("\\w+" + query + "\\w+");
            for (int i = 0; i < n; i++){
                Matcher m = pattern.matcher(sentence[i]);
                while(m.find())
                    counter++;
            }
            System.out.println(counter);
        }

        Pattern pattern = Pattern.compile("\\w+is\\w+");

        while (n-- > 0) {
            String line = s.nextLine();
            Matcher m = pattern.matcher(line);
            if (m.find()) {
                System.out.println(line);
            }
        }


    }
}
