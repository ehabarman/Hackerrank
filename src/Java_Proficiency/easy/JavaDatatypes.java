//Date 8-7-2018
package Java_Proficiency.easy;

import java.util.Scanner;

public class JavaDatatypes {
	 
		public static void main(String []argh) {

	        Scanner sc = new Scanner(System.in);
	        int t=sc.nextInt();

	        for(int i=0;i<t;i++)
	        {

	            try
	            {
	                long x=sc.nextLong();
	                System.out.println(x+" can be fitted in:");
	                if((long)((byte)x)==x)System.out.println("* byte");
	                if((long)((short)x)==x)System.out.println("* short");
	                if((long)((int)x)==x)System.out.println("* int");
	                System.out.println("* long");
	            }
	            catch(Exception e)
	            {
	                System.out.println(sc.next()+" can't be fitted anywhere.");
	            }

	        }
	        sc.close();
	    }
}
