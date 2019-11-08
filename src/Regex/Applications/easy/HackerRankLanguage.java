package Regex.Applications.easy;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HackerRankLanguage {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());
        String languages = "(C|CPP|JAVA|PYTHON|PERL|PHP|RUBY|CSHARP|HASKELL|CLOJURE|BASH|SCALA|ERLANG|CLISP|LUA|" +
                "BRAINFUCK|JAVASCRIPT|GO|D|OCAML|R|PASCAL|SBCL|DART|GROOVY|OBJECTIVEC)";
        Pattern pattern = Pattern.compile("^\\d+\\s"+languages+"$");
        while (n-- > 0) {
            String line = s.nextLine();
            Matcher m = pattern.matcher(line);
            if (m.find())
                System.out.println("VALID");
            else
                System.out.println("INVALID");
        }
    }
}
