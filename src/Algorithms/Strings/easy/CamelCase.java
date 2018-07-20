//Date 20-7-2018
package Algorithms.Strings.easy;

import java.util.Scanner;

public class CamelCase {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String text = s.nextLine();
		int count =1;
		for(int i =0;i<text.length();i++)
			if(text.charAt(i)>='A' && text.charAt(i) <= 'Z')
				count++;
		
		System.out.println(count);
		
		s.close();

	}

}
