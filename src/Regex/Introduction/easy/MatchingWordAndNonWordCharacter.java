package Regex.Introduction.easy;

import java.util.*;
import java.util.regex.*;

public class MatchingWordAndNonWordCharacter {

    public static void main(String[] args) {

        Regex_Test tester = new MatchingWordAndNonWordCharacter.Regex_Test();
        tester.checker("\\w{3}\\W\\w{10}\\W\\w{3}"); // Use \\ instead of using \

    }

    static class Regex_Test {

        public void checker(String Regex_Pattern) {

            Scanner Input = new Scanner(System.in);
            String Test_String = Input.nextLine();
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(Test_String);
            System.out.println(m.find());
        }

    }
}

