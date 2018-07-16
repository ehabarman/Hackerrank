//Date 12-7-2018
package Algorithms.Warmup.easy;

import java.util.Scanner;

public class TimeConversion {

	public static void main(String[] args) {
	      
        Scanner s = new Scanner(System.in);
        String time=s.next();
        int hours = (int)(time.charAt(0)-'0')*10+(int)(time.charAt(1)-'0');
        char t2=time.charAt(2);
        char t3=time.charAt(3);
        char t4=time.charAt(4);
        char t5=time.charAt(5);
        char t6=time.charAt(6);
        char t7=time.charAt(7);
        String m ="";
        m=m+time.charAt(8);
        m=m+time.charAt(9);
        
        if(m.compareTo("PM")==0 && hours!=12)
            hours+=12;
        if(m.compareTo("AM")==0 && hours==12)
            hours=0;
        
        char t0=(char)(hours/10+48);
        char t1=(char)(hours%10+48);
        System.out.println(t0+""+t1+""+t2+""+t3+""+t4+""+t5+""+t6+""+t7);
        s.close();
}
}
