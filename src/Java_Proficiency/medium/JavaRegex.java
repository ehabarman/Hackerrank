//Date 9-8-2018
package Java_Proficiency.medium;

import java.util.Scanner;

public class JavaRegex {

	public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
        in.close();

    }
}

class MyRegex {
	private String part = "((25[0-5])|(2[0-4][0-9])|([0-1]{0,1}[0-9]{1,2}))";
	String pattern = String.format("%s\\.%s\\.%s\\.%s", part, part, part, part);
}