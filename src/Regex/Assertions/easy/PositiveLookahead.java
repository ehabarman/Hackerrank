package Regex.Assertions.easy;

import java.util.*;
import java.util.regex.*;

public class PositiveLookahead {

    public static void main(String[] args) {

        PositiveLookahead.Regex_Test tester = new PositiveLookahead.Regex_Test();
        tester.checker("o(?=oo)");

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

