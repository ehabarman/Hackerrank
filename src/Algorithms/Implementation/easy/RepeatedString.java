//Date 13-7-2018
package Algorithms.Implementation.easy;

import java.util.ArrayList;
import java.util.Scanner;

public class RepeatedString {

	public static void main(String [] args) {
		
		Scanner s = new Scanner(System.in);
		String word = s.next();
		long n = s.nextLong();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		int countInWord=0;
		for(int i=0;i<word.length();i++)
		{
			if(word.charAt(i)=='a')
			{
				countInWord++;
				list.add(i);
			}
		}
		
		long fullWord = (n/word.length())*countInWord;
		n-=(n/word.length())*word.length();
		long fractionWord=0;
		
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i)<n)
				fractionWord++;
		}
		System.out.println(fractionWord+fullWord);
		s.close();
	}
}
