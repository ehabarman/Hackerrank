package Algorithms.Implementation.medium;

//Date 14-7-2018
import java.util.Scanner;

public class TheTimeInWords {
	
	static String []words = {
		    "", "one", "two", "three", "four",
		    "five", "six", "seven", "eight", "nine", "ten",
		    "eleven", "twelve", "thirteen", "fourteen", "quarter",
		    "sixteen", "seventeen", "eighteen", "nineteen", "twenty",
		    "twenty one", "twenty two", "twenty three", "twenty four",
		    "twenty five", "twenty six", "twenty seven",
		    "twenty eight", "twenty nine", "half"};

	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		
		String pastOrTo ="past";
		
		int h = s.nextInt();
		int m = s.nextInt();
		
		if (m > 30) {
			pastOrTo = "to";
		    m = 60 - m;
		    if (++h > 12)
		        h = 1;
		}
		
		if (m == 0)
			System.out.println( words[h]+" o' clock");
		else
			System.out.println(words[m]+(m % 15 == 0 ? "" : m == 1 ? " minute" : " minutes")+" "+pastOrTo+" "+words[h]);
		
		s.close();
	}
}
/*int main (void)



}*/