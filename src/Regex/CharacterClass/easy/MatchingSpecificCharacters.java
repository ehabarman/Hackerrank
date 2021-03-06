package Regex.CharacterClass.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchingSpecificCharacters  {

    public static void main(String[] args) {

        Regex_Test tester = new Regex_Test();
        tester.checker("^[1-3][0-2][xs0][aA30][xsu][.,]$");

    }

    static class Regex_Test {

        public void checker(String Regex_Pattern){

            Scanner Input = new Scanner(System.in);
            String Test_String = Input.nextLine();
            Pattern p = Pattern.compile(Regex_Pattern);
            Matcher m = p.matcher(Test_String);
            System.out.println(m.find());
        }

    }
}

