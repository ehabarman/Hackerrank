package Regex.Assertions.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NegativeLookbehind {

    public static void main(String[] args) {

        NegativeLookbehind.Regex_Test tester = new NegativeLookbehind.Regex_Test();
        tester.checker("(?<![aeiuoAEIOU]).");

    }
    static class Regex_Test {

        public void checker(String Regex_Pattern) {

            Scanner Input = new Scanner(System.in);
            String Test_String = Input.nextLine();
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(Test_String);
            int Count = 0;
            while (m.find()) {
                Count += 1;
            }
            System.out.format("Number of matches : %d", Count);
        }

    }
}