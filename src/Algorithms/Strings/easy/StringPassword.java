//Date 20-7-2018
package Algorithms.Strings.easy;

import java.util.Scanner;
import java.util.regex.Pattern;

public class StringPassword {
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		s.nextLine();
		String password = s.nextLine();
		int count =0;

	    Pattern DIGIT = Pattern.compile(".*\\d.*");
		Pattern LOWER_CASE = Pattern.compile(".*[a-z].*");
		Pattern UPPER_CASE = Pattern.compile(".*[A-Z].*");
		Pattern SPECIAL_CHARACTER = Pattern.compile(".*[!@#$%^&*\\(\\)\\-+].*");

        
		if (!DIGIT.matcher(password).matches())
			count++;
	    if (!LOWER_CASE.matcher(password).matches())
	    	count++;
	    if (!UPPER_CASE.matcher(password).matches())
	    	count++;
	    if (!SPECIAL_CHARACTER.matcher(password).matches())
	    	count++;
		

		
		System.out.println(Math.max(6 - password.length(), count));
		s.close();
	}

}
