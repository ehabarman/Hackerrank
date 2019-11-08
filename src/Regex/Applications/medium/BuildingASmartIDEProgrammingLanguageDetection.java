package Regex.Applications.medium;

import java.util.Scanner;
import java.util.regex.Pattern;

public class BuildingASmartIDEProgrammingLanguageDetection {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Pattern c = Pattern.compile("#include");
        Pattern java = Pattern.compile("import java");
        String code = "";
        try{
            while (true)
                code += s.nextLine();
        }
        catch(Exception e){

        }
        if (c.matcher(code).find())
            System.out.println("C");
        else if (java.matcher(code).find())
            System.out.println("Java");
        else
            System.out.println("Python");

    }
}
