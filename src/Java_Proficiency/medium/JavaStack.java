//Data 9-7-2018
package Java_Proficiency.medium;

import java.util.Scanner;

public class JavaStack {

	public static void main(String[]args)
	{
		Scanner s = new Scanner(System.in);
		
		while(s.hasNext())
		{
			String current = s.nextLine();
			int parentheses1 = 0; //{}
			int parentheses2 = 0; //[]
			int parentheses3 = 0; //()
			
			for(int i=0; i<current.length();i++ )
			{
				switch(current.charAt(i))
				{
				case '{': parentheses1++;
					break;
				case '}': parentheses1--;
					break;
				case '[': parentheses2++;
					break;
				case ']': parentheses2--;
					break;
				case '(': parentheses3++;
					break;
				case ')': parentheses3--;
					break;
				default:
				}
				
				if(parentheses3 <0 ||parentheses2 <0 ||parentheses1<0 )
					break;
			}
			
			if(parentheses3==0 && parentheses2==0&&parentheses1==0)
				System.out.println(true);
			else
				System.out.println(false);
		}
		s.close();
	}
}
